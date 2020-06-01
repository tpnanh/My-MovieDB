package com.example.mymoviedb.apiModels

data class CreditMovieById(
    val id: Long,
    val cast : ArrayList<CastDetail>
)

data class CastDetail(
    val cast_id: Long,
    val character: String,
    val credit_id: String,
    val gender: Int,
    val id : Long,
    val name: String,
    val order: Int,
    val profile_path: String
)