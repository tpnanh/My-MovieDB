package com.example.mymoviedb.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mymoviedb/db/SavedMovieDao;", "", "deleteMovieById", "", "key", "", "get", "Lcom/example/mymoviedb/db/SavedMovieData;", "getAllMovie", "Landroidx/lifecycle/LiveData;", "", "insert", "item", "update", "app_debug"})
public abstract interface SavedMovieDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.db.SavedMovieData item);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.db.SavedMovieData item);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from savedmovie_table WHERE movieId = :key")
    public abstract com.example.mymoviedb.db.SavedMovieData get(long key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from savedmovie_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.mymoviedb.db.SavedMovieData>> getAllMovie();
    
    @androidx.room.Query(value = "DELETE from savedmovie_table WHERE movieId = :key")
    public abstract void deleteMovieById(long key);
}