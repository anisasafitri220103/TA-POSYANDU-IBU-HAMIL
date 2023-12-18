package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TentangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)
        val kembali = findViewById<Button>(R.id.btn_tentang)

       kembali.setOnClickListener {
            val intent = Intent(this@TentangActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}