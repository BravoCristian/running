package com.example.cristianjb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cristianjb.LoginActivity.Companion.useremail
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hola $useremail", Toast.LENGTH_SHORT).show()

    }

    fun callSignOut(view: View){
        signOut()
    }
    private fun signOut(){
        useremail = ""

        FirebaseAuth.getInstance().signOut()
        startActivity (Intent(this, LoginActivity::class.java))
    }
}