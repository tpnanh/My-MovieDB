package com.example.mymoviedb.data.model

data class ResultPopularSeries(
    val original_name: String,
    val genre_ids: ArrayList<Int>,
    val name: String,
    val popularity: Float,
    val origin_country: ArrayList<String>,
    val vote_count: Int,
    val first_air_date: String,
    val backdrop_path: String,
    val original_language: String,
    val id : Long,
    val vote_average: Float,
    val overview: String,
    val poster_path: String
)