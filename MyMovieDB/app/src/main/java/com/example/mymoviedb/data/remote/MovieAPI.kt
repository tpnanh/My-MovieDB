package com.example.mymoviedb.data.remote

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit

private const val BASE_URL = "https://api.themoviedb.org/3/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(APIWorker.gsonConverter)
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .client(APIWorker.client)
    .baseUrl(BASE_URL)
    .build()

object MovieAPI {
    val RETROFIT_SERVICE: APIService by lazy {
        retrofit.create(APIService::class.java)
    }
}