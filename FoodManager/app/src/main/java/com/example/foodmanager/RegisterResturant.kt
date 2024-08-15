package com.example.foodmanager

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterResturant : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registerresturant)

        val nameOfOwnerEditText = findViewById<EditText>(R.id.nameOfOwnerEditText)
        val nameOfRestaurantEditText = findViewById<EditText>(R.id.nameOfRestaurantEditText)
        val emailOrPhoneEditText = findViewById<EditText>(R.id.emailOrPhoneEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val locationEditText = findViewById<EditText>(R.id.locationEditText)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)

        createAccountButton.setOnClickListener {
            val nameOfOwner = nameOfOwnerEditText.text.toString()
            val nameOfRestaurant = nameOfRestaurantEditText.text.toString()
            val emailOrPhone = emailOrPhoneEditText.text.toString()
            val password = passwordEditText.text.toString()
            val location = locationEditText.text.toString()
        }
        createAccountButton.setOnClickListener {
            val intent = Intent(this, DistLog::class.java)
            startActivity(intent)
        }
    }
}
