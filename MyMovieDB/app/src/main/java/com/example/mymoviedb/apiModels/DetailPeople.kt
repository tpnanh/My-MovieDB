package com.example.mymoviedb.apiModels

data class DetailPeople(
    val birthday: String,
    val known_for_department: String,
    val deathday: String,
    val id: Long,
    val name: String,
    val also_known_as: ArrayList<String>,
    val gender: Int,
    val biography: String,
    val popularity: Float,
    val place_of_birth: String,
    val profile_path: String,
    val adult: Boolean,
    val imdb_id: String,
    val homepage: String
)