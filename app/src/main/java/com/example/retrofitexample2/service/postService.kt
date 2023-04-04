package com.example.retrofitexample2.service

import com.example.retrofitexample2.model.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object postService {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = retrofit.create(postApi::class.java)
}