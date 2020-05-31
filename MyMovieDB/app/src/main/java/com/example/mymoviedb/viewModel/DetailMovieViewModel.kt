package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.apiModels.*
import com.example.mymoviedb.apiRepository.MovieRepository
import kotlinx.coroutines.*

class DetailMovieViewModel (app: Application): AndroidViewModel(app) {
    private var viewModelJob = Job()
    private val dataScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    var resultMovieRepository : MovieRepository = MovieRepository(app)

    private var _itemMovie = MutableLiveData<MovieById>()
    val itemMovie : LiveData<MovieById>
    get() = _itemMovie

    var _idMovie = MutableLiveData<Long>()
    val idMovie : LiveData<Long>
        get() = _idMovie

    private var _getMovieCredit = MutableLiveData<ArrayList<CastDetail>>()
    val getMovieCredit: LiveData<ArrayList<CastDetail>>
        get() = _getMovieCredit

    private var resultMovieCredit: ArrayList<CastDetail> = ArrayList()
    private lateinit var movieCast: CreditMovieById

    private var _navigateToDetailPeople = MutableLiveData<CastDetail>()
    val navigateToDetailPeople: LiveData<CastDetail>
        get() = _navigateToDetailPeople

    private var _checkSaved = MutableLiveData<Boolean>()
    val checkSaved : LiveData<Boolean>
        get() = _checkSaved

    init {
        getMovie()
    }

    fun getMovie(){
        dataScope.launch {
            if(idMovie.value!=null){
                movieCast = resultMovieRepository.getCreditMovieById(_idMovie.value!!)
                for (i in 0..movieCast.cast.size - 1) {
                    resultMovieCredit.add(movieCast.cast[i])
                }
                _getMovieCredit.value = resultMovieCredit

                _itemMovie.value = resultMovieRepository.getMovieById(_idMovie.value!!)
                if (resultMovieRepository.getSavedMovieById(_idMovie.value!!)==null){
                   _checkSaved.value = false
                }
                else{
                    _checkSaved.value = true
                }
            }
        }
    }

    fun saveData(data: MovieById) {
        dataScope.launch {
            resultMovieRepository.insertData(data)
        }
    }

//    fun checkSaved(ch: Boolean){
//        dataScope.launch {
//            if (resultMovieRepository.getSavedMovieById(_idMovie.value!!)==null){
//
//            }
//        }
//    }

    fun onDoneClickPeople(){
        _navigateToDetailPeople.value = null
    }
    fun onClickPeople(itemPeople: CastDetail){
        _navigateToDetailPeople.value = itemPeople
    }

    fun onDoneUpdatedMovie(){
        _itemMovie.value = null
    }

    fun onDoneUpdateCast(){
        _getMovieCredit.value = null
    }
}
