package com.example.moviecatalogtmdb.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieInfoDao {

    @Query("SELECT * FROM movie_info_general ORDER BY id DESC")
    fun getMovieList(): LiveData<List<MovieInfoDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<MovieInfoDbModel>)
}