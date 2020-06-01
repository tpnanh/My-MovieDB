package com.example.mymoviedb.apiModels

import java.util.ArrayList

data class MovieById(
    val adult: Boolean,
    val backdrop_path: String,
    //val belongs_to_collection: String,
    val budget: Long,
    val genres: ArrayList<MovieGenres>,
    val homepage: String,
    val id: Long,
    val imdb_id: String,
    val original_title: String,
    val overview: String,
    val popularity: Float,
    val poster_path: String,
    //val production_companies: ArrayList<MovieProductionCompanies>,
   //val production_countries: ArrayList<MovieProductionCountries>,
    val release_date: String,
    val revenue: Long,
    val runtime: Long,
    //val spoken_languages
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    val vote_average: Float,
    val vote_count: Long
)
