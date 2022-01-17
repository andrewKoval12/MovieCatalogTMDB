package com.example.moviecatalogtmdb.domain.movieusecases

import androidx.lifecycle.LiveData

interface MovieRepository {

    fun getMovieInfoList(): LiveData<List<MovieInfo>>

    fun getMovieInfo(film: String): LiveData<List<MovieInfo>>

    suspend fun loadData()
}