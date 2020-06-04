package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vegetables.*

class Vegetables : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)

        //        To open Vegetables Activity
        potatoes.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        carrots.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        cabbage.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        pumpkins.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        hoho.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
    }
}
