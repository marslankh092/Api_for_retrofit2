package com.example.api_for_retrofit;

import com.example.api_for_retrofit.daty.Datum;
import com.example.api_for_retrofit.daty.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

//https://www.omdbapi.com/?apikey=83b533f9&s=movie&page=1
//https://api.cricapi.com/v1/currentMatches?apikey=acdcba6a-5e79-4d7d-8efc-650c785096e2&offset=0

public interface BaseApiService {

    @POST("currentMatches")
    Call<Example> readData(@Query("apikey") String apikey,
                         @Query("offset") String offset)
            ;

}
