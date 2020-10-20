package com.example.mymoviedb.data.remote

import com.example.mymoviedb.data.model.*
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {
    @GET("movie/popular?")
    fun getMoviesPopular(@Query("page") page: Int): Deferred<PopularMovie>

    @GET("person/popular?")
    fun getPeoplePopular(@Query("page") page: Int): Deferred<PopularPeople>

    @GET("tv/popular?")
    fun getSeriesPopular(@Query("page") page: Int): Deferred<PopularSeries>

    @GET ("movie/{movie_id}")
    fun getDetailMovieById(@Path("movie_id") id: Long):Deferred<MovieById>

    @GET ("movie/{movie_id}/credits")
    fun getCreditMovieById(@Path("movie_id") id: Long): Deferred<CreditMovieById>

    @GET ("person/{person_id}")
    fun getDetailPeopleById(@Path("person_id") id: Long): Deferred<DetailPeople>

    @GET ("genre/movie/list?")
    fun getGenres() : Deferred<Genres>

}