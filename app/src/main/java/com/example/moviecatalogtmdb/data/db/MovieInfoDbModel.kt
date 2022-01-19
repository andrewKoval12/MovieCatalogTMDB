package com.example.moviecatalogtmdb.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie_info_general")
 data class MovieInfoDbModel(
    @PrimaryKey
     val id: Int,
     val posterPath: String,
     val releaseDate: String,
     val title: String
 )