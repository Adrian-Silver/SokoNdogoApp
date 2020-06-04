package com.example.attempt7

//import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        auth = FirebaseAuth.getInstance()

        signup_btn.setOnClickListener {
            signUpUser()
        }


    }

    private fun signUpUser() {

        if (su_username.text.toString().isEmpty()) {
            su_username.error = "Please enter username"
            su_username.requestFocus()
            return
        }



        if (su_email.text.toString().isEmpty()) {
            su_email.error = "Please enter email"
            su_email.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(su_email.text.toString()).matches()) {
            su_email.error = "Please enter valid email"
            su_email.requestFocus()
            return
        }

        if (su_password.text.toString().isEmpty()) {
            su_password.error = "Please enter password"
            su_password.requestFocus()
            return
        }

        auth.createUserWithEmailAndPassword(su_email.text.toString(), su_password.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, UserDashboard::class.java))
                    finish()
                } else {
                    Toast.makeText(
                        baseContext, "Sign Up failed. Try again after some time.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

    }
}




//        //        Show Password
//        img_show.setOnClickListener {
//            showPassword()
//        }
//
//        //    Add data into database
//        signup_btn.setOnClickListener {
//            addUser()
//        }



//    //    Grab data from edit text
//    fun addUser(){
//        val  username = su_username.text.trim().toString()
//        val  email = su_email.text.trim().toString()
//        val  password = su_password.text.trim().toString()
//        val id = System.currentTimeMillis()  //Time in milli-seconds
//
////    Initalize show progress bar
//        val appProgress = showProgress()
//
////    Validate input
//        if (username.isEmpty() || email.isEmpty()|| password.isEmpty()){
//            showMessage("Empty fields", "Please ensure all fields have the required data")
//        }else{
////        Firebase database
////        1. Save data into the database
//            val my_ref = FirebaseDatabase.getInstance().reference.child("Users/$id")
////      Data is to be displayed in the following format :  438473478 \\ John \\ Doe \\ email \\Password
//
//            val user_object = UserSchema(username, email, password)
//
////        Show progress bar as data is being added
//            appProgress.show()
//            my_ref.setValue(user_object).addOnCompleteListener{task ->
//                appProgress.dismiss()
//                if (task.isSuccessful){
//                    showMessage("Saving was successful","$username's data has been saved successfuly")
//                    clearEditText()
//                }else{
//                    showMessage("Saving unsuccessful"," Data has not been saved ")
//                }
//            }
//
//        }
//    }
//
//    //    Show message
//    fun showMessage (title:String, message:String){
//        val dialogBox = AlertDialog.Builder(this)
//        dialogBox.setTitle(title)
//        dialogBox.setMessage(message)
//        dialogBox.setPositiveButton("OK",{dialog, which -> dialog.dismiss() })
//        dialogBox.create().show()
//
//    }
//
//    //    ProgressBar
//    fun showProgress(): ProgressDialog {
//        val progress = ProgressDialog(this)
//        progress.setTitle("Saving...")
//        progress.setMessage("Please wait as data is being saved")
//        return progress
//
//    }
//
//    fun clearEditText(){
//        su_username.setText(null)
//        su_email.setText(null)
//        su_password.setText(null)
//    }
//
//    fun showPassword(){
//        if (img_show.tag.toString().equals("Show")){
//            su_password.transformationMethod = HideReturnsTransformationMethod.getInstance()
//            img_show.tag =  "Hide"
//        }else{
//            su_password.transformationMethod = PasswordTransformationMethod.getInstance()
//            su_password.tag = "Show"
//        }
//    }
//
//
//
//
//





