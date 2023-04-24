package com.ms.centerscale_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyRecyclerViewAdapter(val imgUrl:MutableList<String>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false))
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       Picasso.get().load(imgUrl[position]).into(holder.img_display)
    }

    override fun getItemCount(): Int {
        return imgUrl.size
    }

    // inner class
    inner class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val img_display: ImageView
        init {
            img_display = itemView.findViewById(R.id.img) as ImageView
        }

    }


}


