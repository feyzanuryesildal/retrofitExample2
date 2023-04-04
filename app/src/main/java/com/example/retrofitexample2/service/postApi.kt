package com.example.retrofitexample2.service


import com.example.retrofitexample2.model.postsModel
import retrofit2.http.GET
import retrofit2.Call

interface postApi {
    @GET("posts")
    fun getDataFromApi(): Call<postsModel>
}