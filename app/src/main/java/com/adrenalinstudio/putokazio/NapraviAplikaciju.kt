package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class NapraviAplikaciju : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_napravi_aplikaciju)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("napraviprojekat", false)
        val savedBoolean2=sharedPreferences.getBoolean("napraviavd", false)
        val savedBoolean3=sharedPreferences.getBoolean("sadrzaj", false)
        val savedBoolean4=sharedPreferences.getBoolean("intent", false)
        val savedBoolean5=sharedPreferences.getBoolean("ukratko3", false)
        val napraviprojekat=findViewById<Button>(R.id.button20)
        val napraviavd=findViewById<Button>(R.id.button21)
        val kakoubacitisadrzaj=findViewById<Button>(R.id.button22)
        val funkcijaintent=findViewById<Button>(R.id.button6)
        val ukratko3=findViewById<Button>(R.id.button11)
        val napraviprojekatbt=intent.getBooleanExtra("napraviprojekatbt",false)
        val napraviavdbt=intent.getBooleanExtra("napraviavdbt",false)
        val sadrzajbt=intent.getBooleanExtra("sadrzajbt",false)
        val intentbt=intent.getBooleanExtra("intentbt",false)
        val ukratko3bt=intent.getBooleanExtra("ukratko3bt",false)

        val imageButton=findViewById<ImageButton>(R.id.imageButton1)
        napraviprojekat.setOnClickListener {
            val intent= Intent(this,NapraviProjekat::class.java)
            startActivity(intent)
        }
        napraviavd.setOnClickListener {
            val intent= Intent(this,NapraviAVD::class.java)
            startActivity(intent)
        }
        kakoubacitisadrzaj.setOnClickListener {
            val intent= Intent(this,KakoUbacitiSadrzaj::class.java)
            startActivity(intent)
        }
        funkcijaintent.setOnClickListener {
            val intent= Intent(this,FunkcijaIntent::class.java)
            startActivity(intent)
        }
        ukratko3.setOnClickListener {
            val intent= Intent(this,Ukratko3::class.java)
            startActivity(intent)
        }

        if(savedBoolean==true) {
            napraviprojekat.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            napraviavd.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            kakoubacitisadrzaj.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean4==true) {
            funkcijaintent.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean5==true) {
            ukratko3.setBackgroundColor(Color.rgb(89, 171, 43))
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