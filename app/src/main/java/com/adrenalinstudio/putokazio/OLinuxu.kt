package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class OLinuxu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o_linuxu)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("tvoraclinuxa", false)
        val savedBoolean2=sharedPreferences.getBoolean("istorijalinuxa", false)
        val savedBoolean3=sharedPreferences.getBoolean("linuxdanas", false)
        val tvoracLinuxa=findViewById<Button>(R.id.button20)
        val istorijaLinuxa=findViewById<Button>(R.id.button21)
        val linuxDanas=findViewById<Button>(R.id.button22)
        val tvoracLinuxabt=intent.getBooleanExtra("tvoraclinuxabt",false)
        val istorijaLinuxabt=intent.getBooleanExtra("istorijalinuxabt",false)
        val linuxuDanasbt=intent.getBooleanExtra("linuxdanasbt",false)
        val imageButton=findViewById<ImageButton>(R.id.imageButton1)
        tvoracLinuxa.setOnClickListener {
            val intent= Intent(this,tvoracLinuxa::class.java)
            startActivity(intent)
        }
        istorijaLinuxa.setOnClickListener {
            val intent= Intent(this,istorijaLinuxa::class.java)
            startActivity(intent)
        }
        linuxDanas.setOnClickListener {
            val intent= Intent(this,linuxDanas::class.java)
            startActivity(intent)
        }

        if(savedBoolean==true) {
            tvoracLinuxa.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            istorijaLinuxa.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            linuxDanas.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        imageButton.setOnClickListener {
            val intent= Intent(this,androidale::class.java)
            startActivity(intent)
        }
    }
}