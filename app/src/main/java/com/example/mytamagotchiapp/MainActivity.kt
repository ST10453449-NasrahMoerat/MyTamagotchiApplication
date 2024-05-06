package com.example.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val StartGame = findViewById<Button>(R.id.btnStartGame)
        val message = findViewById<TextView>(R.id.result)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        message.text = "Welcome to Charlie Your Tamagotchi App"
    }
}