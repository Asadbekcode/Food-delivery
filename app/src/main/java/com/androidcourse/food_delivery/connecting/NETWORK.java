package com.androidcourse.food_delivery.connecting;

import com.androidcourse.food_delivery.connecting.services.UserService;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NETWORK {
    private static NETWORK instance;
    private static Retrofit retrofit = null;

    public static NETWORK getInstance() {
        if (instance == null) {
            instance = new NETWORK();

        }
        return instance;

    }

    public UserService getUserService() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(getClient(getInterceptor()))
                    .build();

        }
        return retrofit.create(UserService.class);


    }



    private  static OkHttpClient getClient(HttpLoggingInterceptor httpLoggingInterceptorr) {

        return  new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60,TimeUnit.SECONDS)
                .writeTimeout(60,TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptorr)
                .build();


    }


    private HttpLoggingInterceptor getInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

}
