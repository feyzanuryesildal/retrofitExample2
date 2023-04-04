package com.example.retrofitexample2.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitexample2.R
import com.example.retrofitexample2.model.postsModel


 class postsAdapter(val coins: postsModel?, val activity: Activity) : RecyclerView.Adapter<postsAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val txtPrice = itemView.findViewById<TextView>(R.id.txtPrice)
        val image = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_posts,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coins.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coin:postsModel=coins[position]

    }

}