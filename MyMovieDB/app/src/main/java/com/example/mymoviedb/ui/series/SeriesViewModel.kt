package com.example.mymoviedb.ui.series

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviedb.data.model.PopularSeries
import com.example.mymoviedb.data.model.ResultPopularSeries
import com.example.mymoviedb.data.repository.MovieRepository
import kotlinx.coroutines.*

class SeriesViewModel(application: Application) : AndroidViewModel(application) {
    var seriesRepository = MovieRepository(application)
    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    private var _getPopularSeries = MutableLiveData<ArrayList<ResultPopularSeries>>()
    val getPopularSeries: LiveData<ArrayList<ResultPopularSeries>>
        get() = _getPopularSeries

    var _navigateToDetailSeries = MutableLiveData<ResultPopularSeries>()
    val navigateToDetailSeries: LiveData<ResultPopularSeries>
        get() = _navigateToDetailSeries

    private var resultPopularSeries: ArrayList<ResultPopularSeries> = ArrayList()
    private lateinit var popularSeries : PopularSeries
    private var page: Int = 1

    init {
        getPopularSeries()
    }

    private fun getPopularSeries() {
        coroutineScope.launch {
            popularSeries = seriesRepository.getAPIPopularSeries(page)
            for (i in 0..popularSeries.results.size - 1) {
                resultPopularSeries.add(popularSeries.results[i])
            }
            _getPopularSeries.value = resultPopularSeries
        }
    }

    fun onReachBottomSeries() {
        page++
        if (page<=popularSeries.total_pages){
            getPopularSeries()
        }
    }

    fun onClickItem(item: ResultPopularSeries){
        _navigateToDetailSeries.value = item
    }

    fun onDoneClickItem(){
        _navigateToDetailSeries.value = null
    }

}