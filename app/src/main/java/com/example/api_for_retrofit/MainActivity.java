package com.example.api_for_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.api_for_retrofit.daty.Datum;
import com.example.api_for_retrofit.daty.Example;
import com.example.api_for_retrofit.daty.Info;
import com.example.api_for_retrofit.daty.TeamInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private BaseApiService mApiService;

    //https://api.cricapi.com/v1/currentMatches?apikey=acdcba6a-5e79-4d7d-8efc-650c785096e2&offset=0
//https://api.cricapi.com/v1/currentMatches?apikey=acdcba6a-5e79-4d7d-8efc-650c785096e2&offset=1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApiService = UtilsAPI.getApiService();

        mApiService.readData("acdcba6a-5e79-4d7d-8efc-650c785096e2", "1").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example model = response.body();

                List<TeamInfo> info1 = model.getData().get(0).getTeamInfo();
                info1.size();
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}