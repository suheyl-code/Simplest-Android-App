package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewController = findViewById<Button>(R.id.btnButton)
        val countedText = findViewById<TextView>(R.id.txttextView)
        var counter = 0

        textViewController.setOnClickListener {
            counter += 1
            countedText.text = counter.toString()
            //Toast.makeText(this, "Button Clicked!", Toast.LENGTH_LONG).show()
        }
    }
}