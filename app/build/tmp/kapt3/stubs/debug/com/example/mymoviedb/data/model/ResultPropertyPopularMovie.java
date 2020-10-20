package com.example.mymoviedb.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u0012\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u0012H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\tH\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\u00a5\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tH\u00c6\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001J\t\u0010>\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006?"}, d2 = {"Lcom/example/mymoviedb/data/model/ResultPropertyPopularMovie;", "", "popularity", "", "vote_count", "", "video", "", "poster_path", "", "id", "", "adult", "backdrop_path", "original_language", "original_title", "genre_ids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "title", "vote_average", "overview", "release_date", "(FIZLjava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "getBackdrop_path", "()Ljava/lang/String;", "getGenre_ids", "()Ljava/util/ArrayList;", "getId", "()J", "getOriginal_language", "getOriginal_title", "getOverview", "getPopularity", "()F", "getPoster_path", "getRelease_date", "getTitle", "getVideo", "getVote_average", "getVote_count", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ResultPropertyPopularMovie {
    private final float popularity = 0.0F;
    private final int vote_count = 0;
    private final boolean video = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String poster_path = null;
    private final long id = 0L;
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String backdrop_path = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Integer> genre_ids = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final float vote_average = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String release_date = null;
    
    public final float getPopularity() {
        return 0.0F;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getGenre_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final float getVote_average() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    public ResultPropertyPopularMovie(float popularity, int vote_count, boolean video, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, long id, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> genre_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String title, float vote_average, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date) {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymoviedb.data.model.ResultPropertyPopularMovie copy(float popularity, int vote_count, boolean video, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, long id, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> genre_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String title, float vote_average, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date) {
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