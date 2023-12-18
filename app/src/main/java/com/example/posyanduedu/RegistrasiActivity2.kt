package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistrasiActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi2)

        val daftar = findViewById<Button>(R.id.btn_daftar)

        daftar.setOnClickListener {
            val intent = Intent(this@RegistrasiActivity2, LoginActivity2::class.java)
            startActivity(intent)
        }
    }
}