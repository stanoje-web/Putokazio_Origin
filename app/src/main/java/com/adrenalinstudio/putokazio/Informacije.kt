package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Informacije : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacije)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        back.setOnClickListener {
            val intent= Intent(this,HomeActivitz::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,HomeActivitz::class.java)
        startActivity(intent)
    }
}