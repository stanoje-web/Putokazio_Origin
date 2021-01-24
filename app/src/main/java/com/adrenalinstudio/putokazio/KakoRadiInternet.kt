package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ToggleButton

class KakoRadiInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kako_radi_internet)
        val boolean =findViewById<ToggleButton>(R.id.toggleButtonDrawable1)
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("toggleButton", false)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        boolean.isChecked=savedBoolean
        boolean.setOnCheckedChangeListener { _, isChecked ->
            val edit=sharedPreferences.edit()
            edit.apply{
                putBoolean("toggleButton", !savedBoolean)
            }.apply()
            val intent = Intent(this@KakoRadiInternet,Internet2::class.java)
            intent.putExtra("Username",true)
            startActivity(intent)
            }
        back.setOnClickListener {
            val intent= Intent(this,Internet2::class.java)
            startActivity(intent)

        }

        }
    override fun onBackPressed() {
        val intent=Intent(this,Internet2::class.java)
        startActivity(intent)
    }


    }
