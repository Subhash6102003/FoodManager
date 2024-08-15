package com.example.foodmanager

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Outfordelivery : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.outfordelivery)

        val container1 = findViewById<RelativeLayout>(R.id.container1)
        val container2 = findViewById<RelativeLayout>(R.id.container2)
        val container3 = findViewById<RelativeLayout>(R.id.container3)

        setTextViewText(container1, "Customer Name", 15f, "#FF09041B", 32, 18)
        setTextViewText(container1, "Payment", 14f, "#FF3B3B3B", 32, 42, 0.3f)
        setTextViewText(container1, "Not Received", 19f, "#FFE75353", 32, 64)

        setTextViewText(container2, "Customer Name", 15f, "#FF09041B", 32, 18)
        setTextViewText(container2, "Payment", 14f, "#FF3B3B3B", 32, 42, 0.3f)
        setTextViewText(container2, "Received", 19f, "#56E753", 32, 64)

        setTextViewText(container3, "Customer Name", 15f, "#FF09041B", 32, 18)
        setTextViewText(container3, "Payment", 14f, "#FF3B3B3B", 32, 42, 0.3f)
        setTextViewText(container3, "Not Received", 19f, "#FFE75353", 32, 64)
    }

    private fun setTextViewText(
        container: RelativeLayout,
        text: String,
        textSize: Float,
        textColor: String,
        marginLeft: Int,
        marginTop: Int,
        opacity: Float = 1f
    ) {
        val textView = TextView(this)
        textView.text = text
        textView.textSize = textSize
        textView.setTextColor(Color.parseColor(textColor))
        textView.setTypeface(null, Typeface.BOLD) // Set text style
        val params = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        params.leftMargin = dpToPx(marginLeft)
        params.topMargin = dpToPx(marginTop)
        textView.layoutParams = params
        textView.alpha = opacity
        container.addView(textView)
    }

    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density + 0.5f).toInt()
    }

    private fun dpToPx(dp: Float): Int {
        val density = resources.displayMetrics.density
        return (dp * density + 0.5f).toInt()
    }
}
