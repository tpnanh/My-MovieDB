package com.example.mymoviedb.ui.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0019H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\'\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/mymoviedb/ui/filter/FilterViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_getFilterGenres", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "filterRepository", "Lcom/example/mymoviedb/data/repository/MovieRepository;", "getFilterRepository", "()Lcom/example/mymoviedb/data/repository/MovieRepository;", "setFilterRepository", "(Lcom/example/mymoviedb/data/repository/MovieRepository;)V", "getFilterGenres", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getGetFilterGenres", "()Landroidx/lifecycle/LiveData;", "getGenre", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "", "app_debug"})
public final class FilterViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.mymoviedb.data.repository.MovieRepository filterRepository;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> _getFilterGenres;
    private java.util.ArrayList<java.lang.String> getGenre;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.data.repository.MovieRepository getFilterRepository() {
        return null;
    }
    
    public final void setFilterRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.repository.MovieRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getGetFilterGenres() {
        return null;
    }
    
    private final void getFilterGenres() {
    }
    
    public FilterViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}