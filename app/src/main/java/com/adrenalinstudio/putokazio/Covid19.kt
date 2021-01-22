package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Covid19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid19)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("okoronavirusu", false)
        val savedBoolean2=sharedPreferences.getBoolean("kakosezastititi", false)
        val savedBoolean3=sharedPreferences.getBoolean("vakcine", false)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        val okoroni=findViewById<Button>(R.id.button20)
        val zastita=findViewById<Button>(R.id.button21)
        val vakcina=findViewById<Button>(R.id.button22)
        val okoronibt=intent.getBooleanExtra("okoronavirusubt",false)
        val zastitabt=intent.getBooleanExtra("kakosezastititibt",false)
        val vakcinabt=intent.getBooleanExtra("vakcinebt",false)
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
        if(savedBoolean==true) {
            okoroni.setBackgroundColor(Color.rgb(243, 37, 37))
            fun Button.setTextColor(color: Long) = this.setTextColor(color.toInt())
            okoroni.setTextColor(4294967295)

        }
        else{

        }
        if(savedBoolean2==true) {
            zastita.setBackgroundColor(Color.rgb(243, 37, 37))
            fun Button.setTextColor(color: Long) = this.setTextColor(color.toInt())
            zastita.setTextColor(4294967295)
        }
        else{

        }
        if(savedBoolean3==true) {
            vakcina.setBackgroundColor(Color.rgb(243, 37, 37))
            fun Button.setTextColor(color: Long) = this.setTextColor(color.toInt())
            vakcina.setTextColor(4294967295)
        }
        back.setOnClickListener {
            val intent= Intent(this,SveMape::class.java)
            startActivity(intent)

        }



    }
    override fun onBackPressed() {
        val intent=Intent(this,SveMape::class.java)
        startActivity(intent)
    }
}