package com.example.lab2_lyout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Linear_Lyout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_linear__lyout)
    }
}
