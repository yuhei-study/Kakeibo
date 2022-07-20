package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class detail_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        var buttonBack = findViewById<Button>(R.id.button_back)
        buttonBack.setOnClickListener{
            finish()
        }
    }
}