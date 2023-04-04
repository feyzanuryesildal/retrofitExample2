package com.example.retrofitexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitexample2.adapter.postsAdapter
import com.example.retrofitexample2.model.postsModel
import com.example.retrofitexample2.service.postService.api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        api.getDataFromApi().enqueue(object : Callback<postsModel> {
            override fun onFailure(call: Call<postsModel>, t: Throwable) {
                Log.d("NotWorking", t.message!!)
            }

            override fun onResponse(call: Call<postsModel>, response: Response<postsModel>) {
                val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                if (response.isSuccessful) {
                    val adapter = postsAdapter(response.body(), this@MainActivity)
                    recyclerView.adapter = adapter
                } else {
                    // handle error
                }

            }
        })
    }}