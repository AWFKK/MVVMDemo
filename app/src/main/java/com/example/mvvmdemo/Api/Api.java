package com.example.mvvmdemo.Api;

import com.example.mvvmdemo.Model.Hero;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {



    @GET("marvel")
    Call<List<Hero>> getHeroes();



}
