package com.example.mytamagotchiapp

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources

class GameActivity : AppCompatActivity() {
    var petHunger = 100
    var petHealth = 0
    var petCleaniness = 100

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        // set the button and text views
        val Hunger = findViewById<TextView>(R.id.txtHunger)
        val Health = findViewById<TextView>(R.id.txtHealth)
        val Cleanliness = findViewById<TextView>(R.id.txtCleanliness)
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val Image = findViewById<ImageView>(R.id.imageView1)
        updateStatus()

        // Handle button Clicks
        btnFeed.setOnClickListener {
            FeedPet()
            Hunger.text= "Hunger:$petHunger"
            Image.setImageDrawable(getDrawable(R.drawable.petfeed))
        }
        btnClean.setOnClickListener {
            cleanPet()
            Health.text= "Health:$petHealth"
            Image.setImageDrawable(getDrawable(R.drawable.petcleanliness))
        }
        btnPlay.setOnClickListener {
            playwithPet()
            Cleanliness.text = "Cleanliness:$petCleaniness"
            Image.setImageDrawable(getDrawable(R.drawable.petplay))
        }
    }

    fun updateStatus() {

    }

    fun FeedPet() {
        petHunger += 10
        if (petHunger < 0) petHunger = 100
        updateStatus()
    }

    fun cleanPet() {
        petHunger += 10
        if (petHunger < 0) petHunger = 0
        updateStatus()
    }

    fun playwithPet() {
        petHunger += 10
        petCleaniness += 10
        petHealth += 5
        if (petHealth > 100)
            petHealth = 100
        if (petHunger > 100)
            petHunger = 100
        if (petCleaniness < 0)
            petCleaniness = 0
        updateStatus()
    }
}