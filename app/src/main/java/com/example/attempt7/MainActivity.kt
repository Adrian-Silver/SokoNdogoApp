package com.example.attempt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //        To open Signup Activity
        edit_signup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }

        //        To open Login Activity
        edit_login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }



    }
}
