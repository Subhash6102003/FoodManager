package com.example.foodmanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Distributer : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.distributer)

        // Add Menu Button
        val addMenuButton: Button = findViewById(R.id.addMenuButton)
        addMenuButton.setOnClickListener {
            // Add Menu button logic
        }

        // All Item Menu Button
        val allItemMenuButton: Button = findViewById(R.id.allItemMenuButton)
        allItemMenuButton.setOnClickListener {
            // All Item Menu button logic
        }

        // Profile Button
        val profileButton: Button = findViewById(R.id.profileButton)
        profileButton.setOnClickListener {
            // Profile button logic
        }

        // Create New User Button
        val createUserButton: Button = findViewById(R.id.createUserButton)
        createUserButton.setOnClickListener {
            // Create New User button logic
        }

        // Order Dispatch Button
        val orderDispatchButton: Button = findViewById(R.id.orderDispatchButton)
        orderDispatchButton.setOnClickListener {
            // Order Dispatch button logic
        }

        // Log Out Button
        val logoutButton: Button = findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            // Log Out button logic
        }
    }
}
