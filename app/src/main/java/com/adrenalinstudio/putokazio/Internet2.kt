package com.adrenalinstudio.putokazio

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Internet2 : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet2)
        val back=findViewById<ImageButton>(R.id.imageButton3)
        val kakoRadiInternet=findViewById<Button>(R.id.button1)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("toggleButton", false)
        back.setOnClickListener {
            val intent=Intent(this,FrontendDevelop::class.java)
            startActivity(intent)

        }
        kakoRadiInternet.setOnClickListener {
            val intent=Intent(this,KakoRadiInternet::class.java)
            startActivity(intent)

        }
        val buttonjbg=intent.getBooleanExtra("Username",false)
        if(savedBoolean==true) {
            kakoRadiInternet.setBackgroundColor(Color.rgb(89, 171, 43))
        }
        else{

        }




    }
}




