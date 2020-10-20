package com.example.mymoviedb.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0014H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u0019\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\rH\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0010H\u00c6\u0003J\u00a5\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\rH\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d\u00a8\u0006?"}, d2 = {"Lcom/example/mymoviedb/data/model/DetailPeople;", "", "birthday", "", "known_for_department", "deathday", "id", "", "name", "also_known_as", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "gender", "", "biography", "popularity", "", "place_of_birth", "profile_path", "adult", "", "imdb_id", "homepage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "getAlso_known_as", "()Ljava/util/ArrayList;", "getBiography", "()Ljava/lang/String;", "getBirthday", "getDeathday", "getGender", "()I", "getHomepage", "getId", "()J", "getImdb_id", "getKnown_for_department", "getName", "getPlace_of_birth", "getPopularity", "()F", "getProfile_path", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class DetailPeople {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String known_for_department = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deathday = null;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> also_known_as = null;
    private final int gender = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String biography = null;
    private final float popularity = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String place_of_birth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String profile_path = null;
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imdb_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String homepage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKnown_for_department() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeathday() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getAlso_known_as() {
        return null;
    }
    
    public final int getGender() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBiography() {
        return null;
    }
    
    public final float getPopularity() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlace_of_birth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfile_path() {
        return null;
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImdb_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public DetailPeople(@org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String known_for_department, @org.jetbrains.annotations.NotNull()
    java.lang.String deathday, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> also_known_as, int gender, @org.jetbrains.annotations.NotNull()
    java.lang.String biography, float popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String place_of_birth, @org.jetbrains.annotations.NotNull()
    java.lang.String profile_path, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String imdb_id, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
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
    public final com.example.mymoviedb.data.model.DetailPeople copy(@org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String known_for_department, @org.jetbrains.annotations.NotNull()
    java.lang.String deathday, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> also_known_as, int gender, @org.jetbrains.annotations.NotNull()
    java.lang.String biography, float popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String place_of_birth, @org.jetbrains.annotations.NotNull()
    java.lang.String profile_path, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String imdb_id, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage) {
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