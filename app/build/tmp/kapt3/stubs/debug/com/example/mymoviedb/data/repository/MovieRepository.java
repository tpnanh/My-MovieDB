package com.example.mymoviedb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\'2\u0006\u0010%\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/example/mymoviedb/data/repository/MovieRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allSavedMovie", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mymoviedb/db/SavedMovieData;", "getAllSavedMovie", "()Landroidx/lifecycle/LiveData;", "getApplication", "()Landroid/app/Application;", "setApplication", "getAPIPopularMovies", "Lcom/example/mymoviedb/data/model/PopularMovie;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAPIPopularPeople", "Lcom/example/mymoviedb/data/model/PopularPeople;", "getAPIPopularSeries", "Lcom/example/mymoviedb/data/model/PopularSeries;", "getCreditMovieById", "Lcom/example/mymoviedb/data/model/CreditMovieById;", "movieId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailPeopleById", "Lcom/example/mymoviedb/data/model/DetailPeople;", "peopleId", "getGenres", "Lcom/example/mymoviedb/data/model/Genres;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieById", "Lcom/example/mymoviedb/data/model/MovieById;", "getSavedMovieById", "idMovie", "insertData", "", "movie", "(Lcom/example/mymoviedb/data/model/MovieById;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSavedMovieById", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviedb.db.SavedMovieData>> allSavedMovie = null;
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviedb.db.SavedMovieData>> getAllSavedMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAPIPopularMovies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.PopularMovie> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAPIPopularPeople(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.PopularPeople> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAPIPopularSeries(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.PopularSeries> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieById(long movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.MovieById> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreditMovieById(long movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.CreditMovieById> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetailPeopleById(long peopleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.DetailPeople> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertData(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.model.MovieById movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSavedMovieById(long idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.db.SavedMovieData> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeSavedMovieById(long idMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mymoviedb.data.model.Genres> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}