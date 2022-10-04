package com.example.homeflow.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.homeflow.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private val homeActivityIntent by lazy {
        Intent(this, HomeActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(homeActivityIntent)
            finish()
        }, 2000)
    }
}