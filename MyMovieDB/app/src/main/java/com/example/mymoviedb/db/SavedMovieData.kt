package com.example.mymoviedb.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "savedmovie_table")
data class SavedMovieData(
        @PrimaryKey(autoGenerate = true)
        var movieId: Long,

        var movieName: String,

        var movieImage: String,

        var movieBackdropPath: String,

        var movieGenres: String="",

        var movieOverview: String
)
