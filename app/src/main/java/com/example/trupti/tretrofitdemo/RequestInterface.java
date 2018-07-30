package com.example.trupti.tretrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Lenovo on 29-07-2018.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JsonResponse> getJSON();

}
