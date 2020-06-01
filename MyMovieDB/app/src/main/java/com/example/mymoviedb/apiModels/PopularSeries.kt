package com.example.mymoviedb.apiModels

import java.util.ArrayList

data class PopularSeries(
    val page: Int,
    val total_results : Int,
    val total_pages: Int,
    val results : ArrayList<ResultPopularSeries>
)