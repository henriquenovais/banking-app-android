package com.example.homeflow.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeflow.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}