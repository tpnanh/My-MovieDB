package com.example.mymoviedb.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mymoviedb.apiModels.MovieGenres
import java.util.ArrayList

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
