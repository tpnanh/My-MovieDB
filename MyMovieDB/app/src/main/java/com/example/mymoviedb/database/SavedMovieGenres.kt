package com.example.mymoviedb.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "savedMovieGenres_table")
data class SavedMovieGenres(
    @PrimaryKey
    var genresId: Long,

    var genre: String
)