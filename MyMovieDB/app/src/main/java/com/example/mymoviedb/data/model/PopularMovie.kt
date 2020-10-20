package com.example.mymoviedb.data.model

import java.util.ArrayList

data class PopularMovie(
    val page: Int,
    val total_results : Int,
    val total_pages: Int,
    val results : ArrayList<ResultPropertyPopularMovie>
    )

