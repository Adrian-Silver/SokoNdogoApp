package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fruits.*

class Fruits : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        apples.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        bananas.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        oranges.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        avocado.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        watermelon.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }

    }
}
