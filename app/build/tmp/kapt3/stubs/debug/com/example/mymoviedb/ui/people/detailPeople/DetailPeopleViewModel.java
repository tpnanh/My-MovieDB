package com.example.mymoviedb.ui.people.detailPeople;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/mymoviedb/ui/people/detailPeople/DetailPeopleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_idPeople", "Landroidx/lifecycle/MutableLiveData;", "", "get_idPeople", "()Landroidx/lifecycle/MutableLiveData;", "set_idPeople", "(Landroidx/lifecycle/MutableLiveData;)V", "_itemPeople", "Lcom/example/mymoviedb/data/model/DetailPeople;", "dataScope", "Lkotlinx/coroutines/CoroutineScope;", "idPeople", "Landroidx/lifecycle/LiveData;", "getIdPeople", "()Landroidx/lifecycle/LiveData;", "itemPeople", "getItemPeople", "peopleRepository", "Lcom/example/mymoviedb/data/repository/MovieRepository;", "getPeopleRepository", "()Lcom/example/mymoviedb/data/repository/MovieRepository;", "setPeopleRepository", "(Lcom/example/mymoviedb/data/repository/MovieRepository;)V", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "onDoneUpdatePeople", "", "app_debug"})
public final class DetailPeopleViewModel extends androidx.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope dataScope = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.mymoviedb.data.repository.MovieRepository peopleRepository;
    private androidx.lifecycle.MutableLiveData<com.example.mymoviedb.data.model.DetailPeople> _itemPeople;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> _idPeople;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.data.repository.MovieRepository getPeopleRepository() {
        return null;
    }
    
    public final void setPeopleRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviedb.data.repository.MovieRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviedb.data.model.DetailPeople> getItemPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> get_idPeople() {
        return null;
    }
    
    public final void set_idPeople(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getIdPeople() {
        return null;
    }
    
    public final void onDoneUpdatePeople() {
    }
    
    public DetailPeopleViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}