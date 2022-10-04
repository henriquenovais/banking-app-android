package com.example.homeflow.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeflow.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Thread.sleep(3000)
        setContentView(R.layout.activity_home)
    }
}