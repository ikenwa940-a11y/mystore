package com.example.mystore

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message = TextView(this).apply {
            textSize = 20f
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }

        val link = intent?.data
        message.text = if (link != null) {
            "Opened from link:\n$link\n\nMyStore app is installed."
        } else {
            "MyStore is installed.\n\nOpen mystore://open from a web page to test the link."
        }

        setContentView(LinearLayout(this).apply {
            gravity = Gravity.CENTER
            addView(message)
        })
    }
}
