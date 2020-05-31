package com.example.mymoviedb.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//ban dau instance = 0
// van la 0
//@Database(entities = [SavedMovieData::class,SavedMovieGenres::class], version = 10)
//abstract class SavedMovieDatabase : RoomDatabase(){
//    abstract val savedMovieDao: SavedMovieDao
//
//    companion object{
//        @Volatile
//        private var INSTANCE : SavedMovieDatabase?=null
//
//        fun getInstance(context: Context): SavedMovieDatabase{
//            synchronized(this){
//                var instance = INSTANCE
//
//                if(instance==null){
//                    instance = Room.databaseBuilder(
//                            context.applicationContext,
//                            SavedMovieDatabase::class.java,
//                            "savedmovie_history_data"
//                    )
//                            .fallbackToDestructiveMigration()
//                            .build()
//                }
//                return instance
//            }
//        }
//    }
//}

@Database(entities = [SavedMovieData::class,SavedMovieGenres::class], version = 6)
abstract class SavedMovieDatabase : RoomDatabase(){
    abstract val savedMovieDao: SavedMovieDao
}

private lateinit var INSTANCE: SavedMovieDatabase
fun getDatabaseMovie(context: Context):SavedMovieDatabase{
    synchronized(SavedMovieDatabase::class.java){
        if (!::INSTANCE.isInitialized){
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                SavedMovieDatabase::class.java,
                "savedmovie_history_data")
                .addMigrations()
                .fallbackToDestructiveMigration()
                .build()
        }
    }
    return INSTANCE
}