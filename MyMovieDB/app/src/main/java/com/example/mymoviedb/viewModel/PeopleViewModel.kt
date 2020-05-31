package com.example.mymoviedb.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.apiModels.PopularPeople
import com.example.mymoviedb.apiModels.ResultPopularPeople
import com.example.mymoviedb.apiRepository.MovieRepository
import kotlinx.coroutines.*

class PeopleViewModel(application: Application) : AndroidViewModel(application) {
    var peopleRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    private var _getPopularPeople = MutableLiveData<ArrayList<ResultPopularPeople>>()
    val getPopularPeople: LiveData<ArrayList<ResultPopularPeople>>
        get() = _getPopularPeople

    var _navigateToDetailPeople = MutableLiveData<ResultPopularPeople>()
    val navigateToDetailPeople: LiveData<ResultPopularPeople>
        get() = _navigateToDetailPeople

    private var resultPopularPeople: ArrayList<ResultPopularPeople> = ArrayList()
    private lateinit var popularPeople : PopularPeople
    private var page: Int = 1

    init {
        getPopularPeople()
    }

    private fun getPopularPeople() {
        coroutineScope.launch {
            popularPeople = peopleRepository.getAPIPopularPeople(page)
            for (i in 0..popularPeople.results.size - 1) {
                resultPopularPeople.add(popularPeople.results[i])
            }
            _getPopularPeople.value = resultPopularPeople
        }
    }

    fun onReachBottomPeople() {
        page++
        if (page<=popularPeople.total_pages){
            getPopularPeople()
        }
    }

    fun onClickItem(item: ResultPopularPeople){
        _navigateToDetailPeople.value = item
    }

    fun onDoneClickItem(){
        _navigateToDetailPeople.value = null
    }

}