package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Androidstd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_androidstd)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("podesavanja", false)
        val savedBoolean2=sharedPreferences.getBoolean("cfg", false)
        val savedBoolean3=sharedPreferences.getBoolean("java", false)
        val savedBoolean4=sharedPreferences.getBoolean("kotlin", false)
        val savedBoolean5=sharedPreferences.getBoolean("gradle", false)
        val savedBoolean6=sharedPreferences.getBoolean("ukratko2", false)
        val podesavanje=findViewById<Button>(R.id.button20)
        val cfg=findViewById<Button>(R.id.button21)
        val javabt=findViewById<Button>(R.id.button22)
        val kotlin=findViewById<Button>(R.id.button6)
        val gradletb=findViewById<Button>(R.id.button11)
        val ukratko2=findViewById<Button>(R.id.button23)
        val podesavanjabt=intent.getBooleanExtra("podesavanjabt",false)
        val cfgbt=intent.getBooleanExtra("cfgbt",false)
        val javabt2=intent.getBooleanExtra("javabt",false)
        val kotlinbt=intent.getBooleanExtra("kotlinbt",false)
        val gradlebt=intent.getBooleanExtra("gradlebt",false)
        val ukratko2bt=intent.getBooleanExtra("ukratko2bt",false)
        val imageButton=findViewById<ImageButton>(R.id.imageButton1)
        podesavanje.setOnClickListener {
            val intent= Intent(this,Podesavanja::class.java)
            startActivity(intent)
        }
        cfg.setOnClickListener {
            val intent= Intent(this,CfgAnd::class.java)
            startActivity(intent)
        }
        javabt.setOnClickListener {
            val intent= Intent(this,Java::class.java)
            startActivity(intent)
        }
        kotlin.setOnClickListener {
            val intent= Intent(this,Kotlin::class.java)
            startActivity(intent)
        }
        gradletb.setOnClickListener {
            val intent= Intent(this,Gradle::class.java)
            startActivity(intent)
        }
        ukratko2.setOnClickListener {
            val intent= Intent(this,Ukratko2::class.java)
            startActivity(intent)
        }
        if(savedBoolean==true) {
            podesavanje.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            cfg.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
           javabt.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean4==true) {
            kotlin.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean5==true) {
            gradletb.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean6==true) {
            ukratko2.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        imageButton.setOnClickListener {
            val intent=Intent(this,androidale::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,androidale::class.java)
        startActivity(intent)
    }
}