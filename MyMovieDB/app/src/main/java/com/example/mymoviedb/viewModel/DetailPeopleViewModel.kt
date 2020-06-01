package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviedb.apiModels.*
import com.example.mymoviedb.apiRepository.MovieRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class DetailPeopleViewModel (app: Application): AndroidViewModel(app) {
    private var viewModelJob = Job()
    private val dataScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    var peopleRepository : MovieRepository = MovieRepository(app)

    private var _itemPeople = MutableLiveData<DetailPeople>()
    val itemPeople : LiveData<DetailPeople>
        get() = _itemPeople

    var _idPeople = MutableLiveData<Long>()
    val idPeople : LiveData<Long>
        get() = _idPeople

    init {
        dataScope.launch {
            if(idPeople.value!=null){
                _itemPeople.value = peopleRepository.getDetailPeopleById(_idPeople.value!!)
            }
        }
    }

    fun onDoneUpdatePeople(){
        _itemPeople.value = null
    }
}
