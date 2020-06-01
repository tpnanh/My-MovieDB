package com.example.mymoviedb.apiModels

data class ResultPopularPeople(
    val popularity: Float,
    val known_for_department: String,
    val name: String,
    val id: Long,
    val profile_path: String,
    val adult: Boolean,
    //val known_for: ArrayList<Int>,
    val gender: Int
)
