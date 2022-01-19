package com.example.moviecatalogtmdb.data.network

import com.example.moviecatalogtmdb.data.network.model.MovieDetailsDto
import com.example.moviecatalogtmdb.data.network.model.MovieResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {

    @GET("movie/popular")
    suspend fun getPopularMovie(@Query(QUERY_PARAM_PAGE) page: Int): MovieResponseDto

    @GET("movie/{movie_id}")
    suspend fun getDetailMovieInfo(@Query(QUERY_PARAM_MOVIE_ID) movie_id: Int): MovieDetailsDto

    companion object {

        private const val QUERY_PARAM_PAGE = "page"
        private const val QUERY_PARAM_MOVIE_ID = "movie_id"
    }
}