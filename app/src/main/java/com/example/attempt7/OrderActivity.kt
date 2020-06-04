package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //        To open Vegetables Activity
        order_product.setOnClickListener {
            startActivity(Intent(this,ContactDetails::class.java))
        }

    }
}
