package com.example.mymoviedb.data.model

import java.util.ArrayList

data class PopularPeople(
    val page: Int,
    val total_results : Int,
    val total_pages: Int,
    val results : ArrayList<ResultPopularPeople>
)