package com.example.foodmanager

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Uploaditem : AppCompatActivity() {

    // Define the pic id
    private val picId = 123
    // Define the button and imageview type variable
    private lateinit var cameraOpenId: Button
    private lateinit var addItemButton: Button
    private lateinit var submitButton: Button
    private lateinit var itemListLayout: LinearLayout

    // List to hold dynamically added EditTexts
    private val itemEditTexts: MutableList<EditText> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.allitem)

        // Initialize views
        cameraOpenId = findViewById(R.id.btn_upload_image2)
        addItemButton = findViewById(R.id.btn_add_more_items)
        itemListLayout = findViewById(R.id.item2_container)
        submitButton = findViewById(R.id.btn_Submit)

        // Set click listener for the camera button
        cameraOpenId.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, picId)
        }

        // Set click listener for the add more items button
        addItemButton.setOnClickListener {
            addNewItemFields()
        }

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            submitData()
        }
    }

    // This method will help to retrieve the image
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == picId && resultCode == RESULT_OK) {
            val photo = data?.extras?.get("data") as Bitmap
            // Generate ImageView to display captured image
            val imageView = ImageView(this)
            imageView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            imageView.setImageBitmap(photo)
            itemListLayout.addView(imageView) // Add image below the upload button
        }
    }

    // Function to add new item fields dynamically
    private fun addNewItemFields() {
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        // Create new EditText for item name
        val itemNameEditText = EditText(this)
        itemNameEditText.layoutParams = layoutParams
        itemNameEditText.hint = "Item Name"
        itemListLayout.addView(itemNameEditText)
        itemEditTexts.add(itemNameEditText) // Add to the list

        // Create new EditText for item description
        val itemDescriptionEditText = EditText(this)
        itemDescriptionEditText.layoutParams = layoutParams
        itemDescriptionEditText.hint = "Item Description"
        itemListLayout.addView(itemDescriptionEditText)
        itemEditTexts.add(itemDescriptionEditText) // Add to the list

        // Create new EditText for item price
        val itemPriceEditText = EditText(this)
        itemPriceEditText.layoutParams = layoutParams
        itemPriceEditText.hint = "Price (Rupees)"
        itemListLayout.addView(itemPriceEditText)
        itemEditTexts.add(itemPriceEditText) // Add to the list
    }

    // Function to submit the data
    private fun submitData() {
        // Create intent to pass data to ItemData activity
        val intent = Intent(this@Uploaditem, ItemData::class.java).apply {
            // Add data from dynamically added EditTexts to the intent
            putExtra("itemName", itemEditTexts[0].text.toString())
            putExtra("itemDescription", itemEditTexts[1].text.toString())
            putExtra("itemPrice", itemEditTexts[2].text.toString())
        }

        // Start the ItemData activity
        startActivity(intent)
    }
}
