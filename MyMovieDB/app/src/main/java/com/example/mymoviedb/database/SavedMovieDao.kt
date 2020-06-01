package com.example.mymoviedb.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SavedMovieDao{
    @Insert
    fun insert(item: SavedMovieData)

    @Update
    fun update(item: SavedMovieData)

    @Query("SELECT * from savedmovie_table WHERE movieId = :key")
    fun get(key: Long): SavedMovieData

    @Query("SELECT * from savedmovie_table")
    fun getAllMovie(): LiveData<List<SavedMovieData>>

    @Query("DELETE from savedmovie_table WHERE movieId = :key")
    fun deleteMovieById(key: Long)
}
