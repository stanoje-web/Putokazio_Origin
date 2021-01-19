package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InterfejsKomandneLinije : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfejs_komandne_linije)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("kreiranjefajlova", false)
        val savedBoolean2=sharedPreferences.getBoolean("navigacionekomande", false)
        val savedBoolean3=sharedPreferences.getBoolean("vieditor", false)
        val savedBoolean4=sharedPreferences.getBoolean("upravljanjefajlovima", false)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        val navigacionekomandebt=findViewById<Button>(R.id.button20)
        val kreiranjefajlovabt=findViewById<Button>(R.id.button21)
        val upravljanjefajlovimabt=findViewById<Button>(R.id.button22)
        val vieditorbt=findViewById<Button>(R.id.button9)
        val kreiranjefajlovabrt=intent.getBooleanExtra("kreiranjefajlovabt",false)
        val navigacionekomandebrt=intent.getBooleanExtra("navigacionekomandebt",false)
        val upravljanjefajlovimabrt=intent.getBooleanExtra("vieditorbt",false)
        val vieditorbrt=intent.getBooleanExtra("upravljanjefajlovimabt",false)
        navigacionekomandebt.setOnClickListener {
            val intent= Intent(this,NavigacioneKomande::class.java)
            startActivity(intent)
        }
        kreiranjefajlovabt.setOnClickListener {
            val intent= Intent(this,KreiranjeFajlova::class.java)
            startActivity(intent)
        }
        upravljanjefajlovimabt.setOnClickListener {
            val intent= Intent(this,UpravljanjeFajlovima::class.java)
            startActivity(intent)
        }
        vieditorbt.setOnClickListener {
            val intent= Intent(this,ViEditor::class.java)
            startActivity(intent)
        }
        if(savedBoolean==true) {
            kreiranjefajlovabt.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean2==true) {
            navigacionekomandebt.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean3==true) {
            vieditorbt.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        if(savedBoolean4==true) {
            upravljanjefajlovimabt.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }
        back.setOnClickListener {
            val intent= Intent(this,LinuxServeri::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,LinuxServeri::class.java)
        startActivity(intent)
    }
}