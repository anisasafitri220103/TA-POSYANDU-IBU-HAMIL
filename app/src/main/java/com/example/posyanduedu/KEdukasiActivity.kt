package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class KEdukasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedukasi)

        val back = findViewById<Button>(R.id.btn_back0)

        back.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val edukasi = findViewById<Button>(R.id.button1)

        edukasi.setOnClickListener{
            val intent = Intent(this, KategoriActivity::class.java)
            startActivity(intent)
        }
        val kegiatan = findViewById<Button>(R.id.button2)

       kegiatan.setOnClickListener{
            val intent = Intent(this, KjadwalActivity::class.java)
            startActivity(intent)
        }
    }
}