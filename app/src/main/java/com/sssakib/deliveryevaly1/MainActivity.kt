package com.sssakib.deliveryevaly1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        restaurantRecyclerview.layoutManager = LinearLayoutManager(this)
        restaurantRecyclerview.adapter= RestaurantAdapter()



    }
}