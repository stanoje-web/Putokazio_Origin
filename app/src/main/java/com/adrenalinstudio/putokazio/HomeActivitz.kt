package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivitz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_activitz)
        val button = findViewById<Button>(R.id.button7)
        button.setOnClickListener{
            val intent=Intent(this,SveMape::class.java)
            startActivity(intent)


        }
        val button3=findViewById<Button>(R.id.button8)
        button3.setOnClickListener{
            val intent=Intent(this,NovaMapa::class.java)
            startActivity(intent)
        }
        val button4=findViewById<Button>(R.id.button10)


    }
}