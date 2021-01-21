package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Covid19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid19)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        val okoroni=findViewById<Button>(R.id.button20)
        val zastita=findViewById<Button>(R.id.button21)
        val vakcina=findViewById<Button>(R.id.button22)
        okoroni.setOnClickListener {
            val intent = Intent(this, OKoronaVirusu::class.java)
            startActivity(intent)
        }
        zastita.setOnClickListener {
            val intent = Intent(this, KakoSeZastititi::class.java)
            startActivity(intent)
        }
        vakcina.setOnClickListener {
            val intent = Intent(this, Vakcine::class.java)
            startActivity(intent)
        }



    }
}