package com.example.mymoviedb.data.remote

import okhttp3.OkHttpClient
import com.google.gson.GsonBuilder
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object APIWorker {
    private var mClient: OkHttpClient?=null
    private var mGsonConverterFactory: GsonConverterFactory?=null

    val client: OkHttpClient
    get(){
        if (mClient == null){
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val httpBuilder = OkHttpClient.Builder()

            httpBuilder.connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(20,TimeUnit.SECONDS)
                .addInterceptor {
                    val url = it.request().url().newBuilder()
                        .addQueryParameter("api_key", "d42d26834aad4013fc530b202f4c792f")
                        .build()
                    val request = it.request().newBuilder()
                        .url(url)
                        .build()
                    it.proceed(request)
                }
                .addInterceptor(interceptor)//show all JSON in logCat
            mClient = httpBuilder.build()
        }
        return mClient!!
    }

    val gsonConverter: GsonConverterFactory
        get() {
            if (mGsonConverterFactory == null){
                mGsonConverterFactory = GsonConverterFactory
                    .create(
                        GsonBuilder()
                            .setLenient() //định dạng Json theo chuẩn của Gson
                            .disableHtmlEscaping()// xóa các ký hiệu html như <>
                            .create())
            }
            return mGsonConverterFactory!!
        }

}