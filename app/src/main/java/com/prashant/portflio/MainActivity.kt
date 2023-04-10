package com.prashant.portflio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, InformationActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}