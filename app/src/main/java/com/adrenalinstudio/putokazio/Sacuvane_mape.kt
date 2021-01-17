package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Sacuvane_mape : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sacuvane_mape)
        val Picture = getIntent().getStringExtra("picture")
        val imageButton=findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener {
            val intent= Intent(this,HomeActivitz::class.java)
            startActivity(intent)



        }
        
    }
}