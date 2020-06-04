package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grains.*

class Grains : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grains)

        peas.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        beans.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        maize.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        cereals.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }
        nuts.setOnClickListener {
            startActivity(Intent(this,OrderActivity::class.java))
        }


    }
}
