package com.example.mymoviedb.apiModels

data class Genres(
    val genres: ArrayList<MovieGenres>
)

data class MovieGenres(
    val id: Long,
    val name: String
)