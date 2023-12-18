package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PolaTidurActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pola_tidur)
        val back = findViewById<Button>(R.id.btn_nextolahraga)
        back.setOnClickListener{
            val intent = Intent(this, KategoriActivity::class.java)
            startActivity(intent)
        }
    }
}