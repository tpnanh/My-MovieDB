package com.example.mymoviedb.ui.movie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.data.model.PopularMovie
import com.example.mymoviedb.data.model.ResultPropertyPopularMovie
import com.example.mymoviedb.data.repository.MovieRepository
import kotlinx.coroutines.*

class MovieViewModel(application: Application) : AndroidViewModel(application) {
    var movieRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    private var _getPopular = MutableLiveData<ArrayList<ResultPropertyPopularMovie>>()
    val getPopular: LiveData<ArrayList<ResultPropertyPopularMovie>>
    get() = _getPopular

    var _navigateToDetail = MutableLiveData<ResultPropertyPopularMovie>()
    val navigateToDetail: LiveData<ResultPropertyPopularMovie>
        get() = _navigateToDetail

    private var resultPopularMovies: ArrayList<ResultPropertyPopularMovie> = ArrayList()
    private lateinit var popularMovie : PopularMovie
    private var page: Int = 1

    init {
        getPopularMovie()
    }

    private fun getPopularMovie() {
        coroutineScope.launch {
            popularMovie = movieRepository.getAPIPopularMovies(page)
            for (i in 0..popularMovie.results.size - 1) {
                resultPopularMovies.add(popularMovie.results[i])
            }
            _getPopular.value = resultPopularMovies
        }
    }

    fun onReach() {
        page++
        if (page<=popularMovie.total_pages){
            getPopularMovie()
        }
    }

    fun onDoneClickItem(){
        _navigateToDetail.value = null
    }
    fun onClickItem(item: ResultPropertyPopularMovie){
        _navigateToDetail.value = item
    }

}