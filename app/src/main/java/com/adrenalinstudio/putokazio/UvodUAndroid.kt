package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class UvodUAndroid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uvod_u_android)
        val istorijaandroidabt=findViewById<Button>(R.id.button20)
        val imageButton=findViewById<ImageButton>(R.id.imageButton1)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("istorija2", false)
        val savedBoolean2=sharedPreferences.getBoolean("OS", false)
        val savedBoolean3=sharedPreferences.getBoolean("ukratko", false)
        val istorijaAndroida=findViewById<Button>(R.id.button20)
        val operativnisistem=findViewById<Button>(R.id.button21)
        val ukratko=findViewById<Button>(R.id.button22)
        val buttonjbg=intent.getBooleanExtra("Usernamebt",false)
        val buttonos=intent.getBooleanExtra("OSbt",false)
        val buttonuk=intent.getBooleanExtra("ukratkobt",false)
        if(savedBoolean==true) {
            istorijaAndroida.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            ukratko.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            operativnisistem.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        istorijaandroidabt.setOnClickListener {
            val intent= Intent(this,IstorijaAnd::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent=Intent(this@UvodUAndroid, androidale::class.java)
            startActivity(intent)
        }
        operativnisistem.setOnClickListener {
            val intent= Intent(this,OperativniSistemAnd::class.java)
            startActivity(intent)
        }
        ukratko.setOnClickListener {
            val intent=Intent(this,Ukratko::class.java)
            startActivity(intent)
        }

    }
}