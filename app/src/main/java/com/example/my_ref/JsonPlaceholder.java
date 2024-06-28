package com.example.my_ref;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholder {
    @GET("home")
    Call<List<Post>> getPost();
}
