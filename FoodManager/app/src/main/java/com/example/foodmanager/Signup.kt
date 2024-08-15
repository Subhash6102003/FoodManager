package com.example.foodmanager

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)

        val signupTextView = findViewById<TextView>(R.id.button)
        signupTextView.setOnClickListener {
            val intent = Intent(this, DistLog::class.java)
            startActivity(intent)
        }
    }
}