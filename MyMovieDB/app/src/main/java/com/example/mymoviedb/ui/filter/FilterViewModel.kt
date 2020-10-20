package com.example.mymoviedb.ui.filter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.data.repository.MovieRepository
import kotlinx.coroutines.*

class FilterViewModel(application: Application) : AndroidViewModel(application) {
    var filterRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    private var _getFilterGenres = MutableLiveData<ArrayList<String>>()
    val getFilterGenres: LiveData<ArrayList<String>>
        get() = _getFilterGenres

    private var getGenre : ArrayList<String> = ArrayList()

    init {
        getFilterGenres()
    }

    private fun getFilterGenres() {
        coroutineScope.launch {
            for (i in 0..filterRepository.getGenres().genres.size-1){
                getGenre.add(filterRepository.getGenres().genres[i].name)
            }
            _getFilterGenres.value = getGenre
            var a = 0
        }
    }

}