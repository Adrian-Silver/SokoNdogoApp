package com.example.attempt7

class UserSchema {

    var user_name : String = ""
    var user_email : String = ""
    var user_password : String = ""

    constructor(username: String, email:String, password: String){
        this.user_name = username
        this.user_email = email
        this.user_password = password
    }

    constructor(){}
}