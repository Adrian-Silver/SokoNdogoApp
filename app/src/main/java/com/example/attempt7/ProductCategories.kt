package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_categories.*

class ProductCategories : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_categories)

        //        To open Vegetables Activity
        veg_category.setOnClickListener {
            startActivity(Intent(this,Vegetables::class.java))
        }
        //        To open Fruits Activity
        fruits_category.setOnClickListener {
            startActivity(Intent(this,Fruits::class.java))
        }
        //        To open Grains Activity
        grains_category.setOnClickListener {
            startActivity(Intent(this,Grains::class.java))
        }
        //        To open Meat Activity
        meat_category.setOnClickListener {
            startActivity(Intent(this,Meat::class.java))
        }


//        There was meant to be a function control for the back-press button



    }
}
