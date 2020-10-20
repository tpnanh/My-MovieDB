package com.example.mymoviedb.db;

import java.lang.System;

@androidx.room.Entity(tableName = "savedmovie_table")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/example/mymoviedb/db/SavedMovieData;", "", "movieId", "", "movieName", "", "movieImage", "movieBackdropPath", "movieGenres", "movieOverview", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMovieBackdropPath", "()Ljava/lang/String;", "setMovieBackdropPath", "(Ljava/lang/String;)V", "getMovieGenres", "setMovieGenres", "getMovieId", "()J", "setMovieId", "(J)V", "getMovieImage", "setMovieImage", "getMovieName", "setMovieName", "getMovieOverview", "setMovieOverview", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class SavedMovieData {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long movieId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String movieName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String movieImage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String movieBackdropPath;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String movieGenres;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String movieOverview;
    
    public final long getMovieId() {
        return 0L;
    }
    
    public final void setMovieId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMovieName() {
        return null;
    }
    
    public final void setMovieName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMovieImage() {
        return null;
    }
    
    public final void setMovieImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMovieBackdropPath() {
        return null;
    }
    
    public final void setMovieBackdropPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMovieGenres() {
        return null;
    }
    
    public final void setMovieGenres(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMovieOverview() {
        return null;
    }
    
    public final void setMovieOverview(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SavedMovieData(long movieId, @org.jetbrains.annotations.NotNull()
    java.lang.String movieName, @org.jetbrains.annotations.NotNull()
    java.lang.String movieImage, @org.jetbrains.annotations.NotNull()
    java.lang.String movieBackdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String movieGenres, @org.jetbrains.annotations.NotNull()
    java.lang.String movieOverview) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.db.SavedMovieData copy(long movieId, @org.jetbrains.annotations.NotNull()
    java.lang.String movieName, @org.jetbrains.annotations.NotNull()
    java.lang.String movieImage, @org.jetbrains.annotations.NotNull()
    java.lang.String movieBackdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String movieGenres, @org.jetbrains.annotations.NotNull()
    java.lang.String movieOverview) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}