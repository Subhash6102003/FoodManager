package com.example.foodmanager

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.itemlist)

        // Retrieve data from intent
        val itemNames = intent.getStringExtra("itemName")?.split(", ") ?: listOf("Item Name Not Available")
        val itemDescriptions = intent.getStringExtra("itemDescription")?.split(", ") ?: listOf("Description Not Available")
        val itemPrices = intent.getStringExtra("itemPrice")?.split(", ") ?: listOf("Price Not Available")

        // Get references to TextViews
        val itemNameTextView = findViewById<TextView>(R.id.text_item_name)
        val itemDescriptionTextView = findViewById<TextView>(R.id.text_item_description)
        val itemPriceTextView = findViewById<TextView>(R.id.text_item_price)

        // Combine items into a single string to display
        val displayText = itemNames.zip(itemDescriptions.zip(itemPrices)) { name, descAndPrice ->
            val (description, price) = descAndPrice
            "$name\n$description\n$price\n\n"
        }.joinToString("\n")

        itemNameTextView.text = "Items Names:\n${itemNames.joinToString("\n")}"
        itemDescriptionTextView.text = "Descriptions:\n${itemDescriptions.joinToString("\n")}"
        itemPriceTextView.text = "Prices:\n${itemPrices.joinToString("\n")}"
    }
}
