package com.ms.centerscale_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val layoutManager = ScaleCenterItemLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager

        generateItem();
    }

    private fun generateItem() {
        val random = Random(0)
        val list = ArrayList<String>()
        for(i in 0 until 10)
            list.add("https://picsum.photos/150/150?random= ${random.nextInt()}")
        val adapter = MyRecyclerViewAdapter(list)
        recyclerView.adapter = adapter
    }
}
//https://picsum.photos/150/150?random=