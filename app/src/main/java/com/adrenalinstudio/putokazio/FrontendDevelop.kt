package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class FrontendDevelop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontend_develop)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        val internet=findViewById<Button>(R.id.button1)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("toggleButton", false)
        back.setOnClickListener {
            val intent= Intent(this,SveMape::class.java)
            startActivity(intent)

        }
        internet.setOnClickListener {
            val intent= Intent(this,Internet2::class.java)
            startActivity(intent)

        }
        val button2=intent.getBooleanExtra("Username",false)

        if(savedBoolean==true) {
            internet.setBackgroundColor(Color.rgb(42,88,137))

        }
        else
        {

        }
    }
}