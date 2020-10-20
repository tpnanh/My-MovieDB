package com.example.mymoviedb.ui.saved

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.data.repository.MovieRepository
import com.example.mymoviedb.db.SavedMovieData
import kotlinx.coroutines.*

class SavedViewModel(application: Application) : AndroidViewModel(application) {
    var savedRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    var _idMovieSaved = MutableLiveData<Long>()
    val idMovieSaved : LiveData<Long>
        get() = _idMovieSaved

    var _savedMovie = MutableLiveData<SavedMovieData>()
    val savedMovie : LiveData<SavedMovieData>
        get() = _savedMovie

    val allSavedMovie: LiveData<List<SavedMovieData>> = savedRepository.allSavedMovie

    init {
        getSavedMovie()
    }

    private fun getSavedMovie() {
        coroutineScope.launch {
        }
    }

    fun onDoneSavedMovie(){
        _savedMovie.value = null
    }
    fun onClickSavedMovie(itemSavedUpdated: SavedMovieData){
        _savedMovie.value = itemSavedUpdated
    }
}