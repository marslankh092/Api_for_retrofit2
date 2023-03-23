package com.example.api_for_retrofit;

public class UtilsAPI {
//https://api.cricapi.com/v1/currentMatches?apikey=acdcba6a-5e79-4d7d-8efc-650c785096e2&offset=1
    public static final String BASE_ROOT_URL = "https://api.cricapi.com/v1/";

    public static BaseApiService getApiService() {
        return RetrofitClient.getClient(BASE_ROOT_URL).create(BaseApiService.class);
    }
}
