package com.example.foodmanager

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val signupTextView = findViewById<TextView>(R.id.textView3)
        signupTextView.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<Button>(R.id.button)
        loginButton.setOnClickListener {
            val intent = Intent(this, Uploaditem::class.java)
            startActivity(intent)
        }
    }
}
