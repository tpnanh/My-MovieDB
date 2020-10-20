package com.example.mymoviedb.ui.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\bJ\u0006\u0010\'\u001a\u00020$J\u0006\u0010(\u001a\u00020$R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00120\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/mymoviedb/ui/people/PeopleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_getPopularPeople", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/mymoviedb/data/model/ResultPopularPeople;", "_navigateToDetailPeople", "get_navigateToDetailPeople", "()Landroidx/lifecycle/MutableLiveData;", "set_navigateToDetailPeople", "(Landroidx/lifecycle/MutableLiveData;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getPopularPeople", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getGetPopularPeople", "()Landroidx/lifecycle/LiveData;", "navigateToDetailPeople", "getNavigateToDetailPeople", "page", "", "peopleRepository", "Lcom/example/mymoviedb/data/repository/MovieRepository;", "getPeopleRepository", "()Lcom/example/mymoviedb/data/repository/MovieRepository;", "setPeopleRepository", "(Lcom/example/mymoviedb/data/repository/MovieRepository;)V", "popularPeople", "Lcom/example/mymoviedb/data/model/PopularPeople;", "resultPopularPeople", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "", "onClickItem", "item", "onDoneClickItem", "onReachBottomPeople", "app_debug"})
public final class PeopleViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.mymoviedb.data.repository.MovieRepository peopleRepository;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.mymoviedb.data.model.ResultPopularPeople>> _getPopularPeople;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.mymoviedb.data.model.ResultPopularPeople> _navigateToDetailPeople;
    private java.util.ArrayList<com.example.mymoviedb.data.model.ResultPopularPeople> resultPopularPeople;
    private com.example.mymoviedb.data.model.PopularPeople popularPeople;
    private int page;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.data.repository.MovieRepository getPeopleRepository() {
        return null;
    }
    
    public final void setPeopleRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.repository.MovieRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.mymoviedb.data.model.ResultPopularPeople>> getGetPopularPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.mymoviedb.data.model.ResultPopularPeople> get_navigateToDetailPeople() {
        return null;
    }
    
    public final void set_navigateToDetailPeople(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.mymoviedb.data.model.ResultPopularPeople> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviedb.data.model.ResultPopularPeople> getNavigateToDetailPeople() {
        return null;
    }
    
    private final void getPopularPeople() {
    }
    
    public final void onReachBottomPeople() {
    }
    
    public final void onClickItem(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.model.ResultPopularPeople item) {
    }
    
    public final void onDoneClickItem() {
    }
    
    public PeopleViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}