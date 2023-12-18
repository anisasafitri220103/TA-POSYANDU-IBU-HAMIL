package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class KategoriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val istirahat = findViewById<Button>(R.id.kategori1)
        istirahat.setOnClickListener {
            val intent = Intent(this, PolaTidurActivity::class.java)
            startActivity(intent)

            val nutrisi = findViewById<Button>(R.id.kategori2)
            nutrisi.setOnClickListener {
                val intent = Intent(this, NutrisiActivity::class.java)
                startActivity(intent)

                val stimulasi = findViewById<Button>(R.id.kategori3)
                stimulasi.setOnClickListener {
                    val intent = Intent(this, StimJaninActivity::class.java)
                    startActivity(intent)

                    val bahaya = findViewById<Button>(R.id.kategori4)
                    bahaya.setOnClickListener {
                        val intent = Intent(this, BahayaActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
    }
}