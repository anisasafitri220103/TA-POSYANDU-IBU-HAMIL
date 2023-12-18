package com.example.posyanduedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val login = findViewById<Button>(R.id.btn_login)

        login.setOnClickListener {
            val intent = Intent(this@LoginActivity2, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}