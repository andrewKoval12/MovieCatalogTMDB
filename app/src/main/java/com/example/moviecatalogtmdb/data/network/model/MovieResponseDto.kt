package com.example.moviecatalogtmdb.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieResponseDto(
    val page: Int,
    @SerializedName("results")
    val movieList: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
