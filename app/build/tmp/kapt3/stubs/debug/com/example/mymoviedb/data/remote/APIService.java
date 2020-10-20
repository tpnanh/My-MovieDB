package com.example.mymoviedb.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mymoviedb/data/remote/APIService;", "", "getCreditMovieById", "Lkotlinx/coroutines/Deferred;", "Lcom/example/mymoviedb/data/model/CreditMovieById;", "id", "", "getDetailMovieById", "Lcom/example/mymoviedb/data/model/MovieById;", "getDetailPeopleById", "Lcom/example/mymoviedb/data/model/DetailPeople;", "getGenres", "Lcom/example/mymoviedb/data/model/Genres;", "getMoviesPopular", "Lcom/example/mymoviedb/data/model/PopularMovie;", "page", "", "getPeoplePopular", "Lcom/example/mymoviedb/data/model/PopularPeople;", "getSeriesPopular", "Lcom/example/mymoviedb/data/model/PopularSeries;", "app_debug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular?")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.PopularMovie> getMoviesPopular(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "person/popular?")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.PopularPeople> getPeoplePopular(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tv/popular?")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.PopularSeries> getSeriesPopular(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.MovieById> getDetailMovieById(@retrofit2.http.Path(value = "movie_id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}/credits")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.CreditMovieById> getCreditMovieById(@retrofit2.http.Path(value = "movie_id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "person/{person_id}")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.DetailPeople> getDetailPeopleById(@retrofit2.http.Path(value = "person_id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "genre/movie/list?")
    public abstract kotlinx.coroutines.Deferred<com.example.mymoviedb.data.model.Genres> getGenres();
}