package com.example.moviecatalogtmdb.data.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

abstract class AppDatabase : RoomDatabase() {
    companion object {
        private var db: AppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        @InternalCoroutinesApi
        fun getInstance(context: Context): AppDatabase {
            synchronized(LOCK){
                db?.let {return it}
                val instance = Room.databaseBuilder(context,AppDatabase::class.java, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build()
                db = instance
                return instance
            }
        }
    }
}