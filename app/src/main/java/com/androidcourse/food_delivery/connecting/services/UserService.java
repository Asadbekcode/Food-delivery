package com.androidcourse.food_delivery.connecting.services;

import com.google.firebase.firestore.auth.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

public interface UserService {

   @GET("users")
    Observable<Response<List<User>>> getUsers();
}
