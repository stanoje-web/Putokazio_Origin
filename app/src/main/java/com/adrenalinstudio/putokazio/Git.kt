package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Git : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("kontrola", false)
        val savedBoolean2=sharedPreferences.getBoolean("osnovegita", false)
        val savedBoolean3=sharedPreferences.getBoolean("komandnalinija", false)
        val savedBoolean4=sharedPreferences.getBoolean("gitpodesavanja", false)
        val savedBoolean5=sharedPreferences.getBoolean("repozitorijum", false)
        var kontrolaverzije=findViewById<Button>(R.id.button1)
        val osnovegita=findViewById<Button>(R.id.button12)
        val komandnalinija=findViewById<Button>(R.id.button13)
        val podesavanje=findViewById<Button>(R.id.button18)
        val rep=findViewById<Button>(R.id.button19)
        val kontrolaverzijebt=intent.getBooleanExtra("kontrolabt",false)
        val osnovegitabt=intent.getBooleanExtra("osnovegitabt",false)
        val komandnalinijabt=intent.getBooleanExtra("komandnalinijabt",false)
        val podesavanjebt=intent.getBooleanExtra("gitpodesavanjabt",false)
        val repbt=intent.getBooleanExtra("repozitorijumbt",false)
        val imageButton=findViewById<ImageButton>(R.id.imageButton1)

        kontrolaverzije.setOnClickListener {
            val intent= Intent(this,OKontroliVerzije::class.java)
            startActivity(intent)
        }
        osnovegita.setOnClickListener {
            val intent= Intent(this,OsnoveGita::class.java)
            startActivity(intent)
        }
        komandnalinija.setOnClickListener {
            val intent= Intent(this,KomandnaLinija::class.java)
            startActivity(intent)
        }
        podesavanje.setOnClickListener {
            val intent= Intent(this,GitPodesavanja::class.java)
            startActivity(intent)
        }
        rep.setOnClickListener {
            val intent= Intent(this,PravljenjeRepozitorijuma::class.java)
            startActivity(intent)
        }

        if(savedBoolean==true) {
            kontrolaverzije.setBackgroundColor(Color.rgb(89, 171, 43))

        }
        else{

        }
        if(savedBoolean2==true) {
            osnovegita.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            komandnalinija.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean4==true) {
            podesavanje.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean5==true) {
            rep.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }

        imageButton.setOnClickListener {
            val intent= Intent(this,SveMape::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,SveMape::class.java)
        startActivity(intent)
    }
}