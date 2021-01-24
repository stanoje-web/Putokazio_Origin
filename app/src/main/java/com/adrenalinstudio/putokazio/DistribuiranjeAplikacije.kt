package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DistribuiranjeAplikacije : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distribuiranje_aplikacije)
        val objavljivanje=findViewById<Button>(R.id.button20)
        val konfiguracija=findViewById<Button>(R.id.button21)
        val priprema=findViewById<Button>(R.id.button22)
        val ukratko4=findViewById<Button>(R.id.button23)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean1=sharedPreferences.getBoolean("priprema", false)
        val savedBoolean2=sharedPreferences.getBoolean("konfigurisanje", false)
        val savedBoolean3=sharedPreferences.getBoolean("appzaobj", false)
        val savedBoolean4=sharedPreferences.getBoolean("ukratko4", false)
        val pripremabt=intent.getBooleanExtra("pripremabt",false)
        val konfigurisanjebt=intent.getBooleanExtra("konfigurisanjebt",false)
        val objavljivanjebt=intent.getBooleanExtra("appzaobjbt",false)
        val ukratko4bt=intent.getBooleanExtra("ukratko4bt",false)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        objavljivanje.setOnClickListener {
            val intent= Intent(this,PripremaAplikacije::class.java)
            startActivity(intent)
        }
        konfiguracija.setOnClickListener {
            val intent= Intent(this,KonfiguracijaAplikacije::class.java)
            startActivity(intent)
        }
        priprema.setOnClickListener {
            val intent= Intent(this,AplikacijeZaObjavljivanje::class.java)
            startActivity(intent)
        }
        ukratko4.setOnClickListener {
            val intent= Intent(this,Ukratko4::class.java)
            startActivity(intent)
        }
        if(savedBoolean1==true) {
            objavljivanje.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            konfiguracija.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            priprema.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean4==true) {
            ukratko4.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        back.setOnClickListener {
            val intent= Intent(this,androidale::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,androidale::class.java)
        startActivity(intent)
    }
}