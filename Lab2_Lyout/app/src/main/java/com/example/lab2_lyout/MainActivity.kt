package com.example.lab2_lyout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        btn_relative.setOnClickListener { View ->
            Toast.makeText(this,"Show Relative", Toast.LENGTH_SHORT).show()
            var rela = Intent(this,Relative_lyout::class.java)
            startActivity(rela)
        }
        btn_linear.setOnClickListener { View ->
            Toast.makeText(this,"Show Linear", Toast.LENGTH_SHORT).show()
            var linear = Intent(this,Linear_Lyout::class.java)
            startActivity(linear)
        }
        btn_con.setOnClickListener { View ->
            Toast.makeText(this,"Show Constrant", Toast.LENGTH_SHORT).show()
            var con = Intent(this,Constrant_Layout::class.java)
            startActivity(con)
        }
    }
}
