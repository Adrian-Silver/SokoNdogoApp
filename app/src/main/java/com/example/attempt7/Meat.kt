package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_meat.*

class Meat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meat)

        pork.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        chicken.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        beef.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        fillet.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        fish.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }

    }
}
