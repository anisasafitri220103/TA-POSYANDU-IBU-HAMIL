package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class EdukasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi)
        val menu1 = findViewById<CardView>(R.id.edukasi1)

        menu1.setOnClickListener {
            val intent = Intent(this, PolaTidurActivity::class.java)
            startActivity(intent)
        }
        val menu2 = findViewById<CardView>(R.id.edukasi2)

        menu2.setOnClickListener {
            val intent = Intent(this, StimJaninActivity::class.java)
            startActivity(intent)
        }
        val menu3 = findViewById<CardView>(R.id.edukasi3)

        menu3.setOnClickListener {
            val intent = Intent(this, NutrisiActivity::class.java)
            startActivity(intent)
        }
        val menu4 = findViewById<CardView>(R.id.edukasi4)

        menu4.setOnClickListener {
            val intent = Intent(this, OlahragaActivity::class.java)
            startActivity(intent)
            }
    }
}