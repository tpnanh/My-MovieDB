package com.example.mymoviedb.ui.saved;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rJ\u0006\u0010&\u001a\u00020#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/mymoviedb/ui/saved/SavedViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_idMovieSaved", "Landroidx/lifecycle/MutableLiveData;", "", "get_idMovieSaved", "()Landroidx/lifecycle/MutableLiveData;", "set_idMovieSaved", "(Landroidx/lifecycle/MutableLiveData;)V", "_savedMovie", "Lcom/example/mymoviedb/db/SavedMovieData;", "get_savedMovie", "set_savedMovie", "allSavedMovie", "Landroidx/lifecycle/LiveData;", "", "getAllSavedMovie", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "idMovieSaved", "getIdMovieSaved", "savedMovie", "getSavedMovie", "savedRepository", "Lcom/example/mymoviedb/data/repository/MovieRepository;", "getSavedRepository", "()Lcom/example/mymoviedb/data/repository/MovieRepository;", "setSavedRepository", "(Lcom/example/mymoviedb/data/repository/MovieRepository;)V", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "", "onClickSavedMovie", "itemSavedUpdated", "onDoneSavedMovie", "app_debug"})
public final class SavedViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.mymoviedb.data.repository.MovieRepository savedRepository;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> _idMovieSaved;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.mymoviedb.db.SavedMovieData> _savedMovie;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviedb.db.SavedMovieData>> allSavedMovie = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.data.repository.MovieRepository getSavedRepository() {
        return null;
    }
    
    public final void setSavedRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.repository.MovieRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> get_idMovieSaved() {
        return null;
    }
    
    public final void set_idMovieSaved(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getIdMovieSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.mymoviedb.db.SavedMovieData> get_savedMovie() {
        return null;
    }
    
    public final void set_savedMovie(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.mymoviedb.db.SavedMovieData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviedb.db.SavedMovieData> getSavedMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviedb.db.SavedMovieData>> getAllSavedMovie() {
        return null;
    }
    
    private final void getSavedMovie() {
    }
    
    public final void onDoneSavedMovie() {
    }
    
    public final void onClickSavedMovie(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.db.SavedMovieData itemSavedUpdated) {
    }
    
    public SavedViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}