package com.example.moviecatalogtmdb.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieApiFactory {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val apiService: MovieApiService = retrofit.create(MovieApiService::class.java)
}