package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.apiModels.PopularMovie
import com.example.mymoviedb.apiModels.ResultPropertyPopularMovie
import com.example.mymoviedb.apiRepository.MovieRepository
import kotlinx.coroutines.*

class FilterViewModel(application: Application) : AndroidViewModel(application) {
    var movieRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )


    init {
        getPopularMovie()
    }

    private fun getPopularMovie() {
        coroutineScope.launch {
            for (i in 0..popularMovie.results.size - 1) {
                resultPopularMovies.add(popularMovie.results[i])
            }
            _getPopular.value = resultPopularMovies
        }
    }

}