package com.example.mymoviedb.apiRepository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.mymoviedb.api.MovieAPI
import com.example.mymoviedb.apiModels.*
import com.example.mymoviedb.database.*
import com.google.android.gms.tasks.Tasks.await
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieRepository (var application: Application) {
    //var dataSource : SavedMovieDao = SavedMovieDatabase.getInstance(application).savedMovieDao

    val allSavedMovie: LiveData<List<SavedMovieData>> = getDatabaseMovie(application).savedMovieDao.getAllMovie()

    suspend fun getAPIPopularMovies(page : Int): PopularMovie{
        var value: PopularMovie = PopularMovie(1,5,3, ArrayList<ResultPropertyPopularMovie>())
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getMoviesPopular(page).await()
        }
        return value
    }

    suspend fun getAPIPopularPeople(page : Int): PopularPeople{
        var value: PopularPeople = PopularPeople(1,5,3, ArrayList<ResultPopularPeople>())
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getPeoplePopular(page).await()
        }
        return value
    }

    suspend fun getAPIPopularSeries(page : Int): PopularSeries{
        var value: PopularSeries = PopularSeries(1,5,3, ArrayList<ResultPopularSeries>())
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getSeriesPopular(page).await()
        }
        return value
    }

    suspend fun getMovieById(movieId: Long): MovieById{
        var value: MovieById = MovieById(false,"",0L,ArrayList<MovieGenres>(),"",0L,"","","",0F,"","",0L,0L,"","","",false,0F,0L)
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getDetailMovieById(movieId).await()
        }
        return value
    }

    suspend fun getCreditMovieById(movieId: Long): CreditMovieById{
        var value: CreditMovieById = CreditMovieById(0L,ArrayList<CastDetail>())
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getCreditMovieById(movieId).await()
        }
        return value
    }

    suspend fun getDetailPeopleById(peopleId: Long): DetailPeople{
        var value: DetailPeople = DetailPeople("","","",0L,"",ArrayList<String>(),0,"",0F,"","",false,"","")
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getDetailPeopleById(peopleId).await()
        }
        return value
    }

    suspend fun insertData(movie: MovieById){
        withContext(Dispatchers.IO) {
            var thisMovie: SavedMovieData = SavedMovieData(0,"","","", "", "")
            thisMovie.movieId = movie.id
            thisMovie.movieName = movie.original_title
            thisMovie.movieImage = movie.poster_path
            thisMovie.movieBackdropPath = movie.backdrop_path
            for (i in movie.genres){
                thisMovie.movieGenres = thisMovie.movieGenres+","+i.name
            }
            thisMovie.movieGenres = thisMovie.movieGenres.substring(1)
            thisMovie.movieOverview = movie.overview
            getDatabaseMovie(application).savedMovieDao.insert(thisMovie)
        }
    }

    suspend fun getSavedMovieById(idMovie: Long): SavedMovieData{
        var item: SavedMovieData = SavedMovieData(0,"","","","","")
        withContext(Dispatchers.IO){
            item = getDatabaseMovie(application).savedMovieDao.get(idMovie)
        }
        return item
    }

    suspend fun removeSavedMovieById(idMovie: Long){
        withContext(Dispatchers.IO){
            getDatabaseMovie(application).savedMovieDao.deleteMovieById(idMovie)
        }
    }

    suspend fun getGenres(): Genres{
        var value: Genres = Genres(ArrayList())
        withContext(Dispatchers.IO){
            value = MovieAPI.RETROFIT_SERVICE.getGenres().await()
        }
        return value
    }
}