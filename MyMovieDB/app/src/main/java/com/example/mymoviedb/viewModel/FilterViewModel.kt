package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.apiModels.MovieGenres
import com.example.mymoviedb.apiModels.PopularMovie
import com.example.mymoviedb.apiModels.ResultPropertyPopularMovie
import com.example.mymoviedb.apiRepository.MovieRepository
import kotlinx.coroutines.*

class FilterViewModel(application: Application) : AndroidViewModel(application) {
    var filterRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    private var _getFilterGenres = MutableLiveData<ArrayList<MovieGenres>>()
    val getFilterGenres: LiveData<ArrayList<MovieGenres>>
        get() = _getFilterGenres

    private var _getGenre = MutableLiveData<ArrayList<String>>()

    init {
        getFilterGenres()
    }

    private fun getFilterGenres() {
        coroutineScope.launch {
//            for (i in 0..filterRepository.getGenres()){
//                print("Alo: "+filterRepository.getGenres().genres.size)
//            }
        }
    }

}