package com.example.moviecatalogtmdb.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieDto(
    val id: Int,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    val title: String
)