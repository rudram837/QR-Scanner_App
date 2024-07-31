package com.example.qrcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult: TextView = findViewById(R.id.tvResult)

        // Get the scanned QR code data from the intent
        val scanResult = intent.getStringExtra("SCAN_RESULT")

        // Display the scanned QR code data
        tvResult.text = scanResult
    }
}