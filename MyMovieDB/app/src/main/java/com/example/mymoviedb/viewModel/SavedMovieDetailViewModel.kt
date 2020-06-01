package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviedb.apiModels.*
import com.example.mymoviedb.apiRepository.MovieRepository
import com.example.mymoviedb.database.SavedMovieData
import kotlinx.coroutines.*

class SavedMovieDetailViewModel (app: Application): AndroidViewModel(app) {
    private var viewModelJob = Job()
    private val dataScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    var savedMovieRepository : MovieRepository = MovieRepository(app)

    private var _savedDetailMovie = MutableLiveData<SavedMovieData>()
    val savedDetailMovie : LiveData<SavedMovieData>
        get() = _savedDetailMovie

    var _idSavedDetailMovie = MutableLiveData<Long>()
    val idSavedDetailMovie : LiveData<Long>
        get() = _idSavedDetailMovie

    init {
        getSavedMovie()
    }

    fun getSavedMovie(){
        dataScope.launch {
            if(idSavedDetailMovie.value!=null){
                _savedDetailMovie.value = savedMovieRepository.getSavedMovieById(_idSavedDetailMovie.value!!)
            }
        }
    }

    fun removeSavedMovie(idRemove: Long){
        dataScope.launch {
            savedMovieRepository.removeSavedMovieById(idRemove)
        }
    }

    fun onDoneUpdatedSavedMovie(){
        _savedDetailMovie.value = null
    }
}
