package com.example.stream_project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    startActivity(Intent(this,HomeActivity::class.java))
                    finish()

                },2000
        )
    }
}