package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ToggleButton

class KonfiguracijaAplikacije : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfiguracija_aplikacije)
        val boolean2 =findViewById<ToggleButton>(R.id.toggleButtonDrawable1)
        val sharedPreferences2=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean2=sharedPreferences2.getBoolean("konfigurisanje", false)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        boolean2.isChecked=savedBoolean2
        boolean2.setOnCheckedChangeListener { _, isChecked ->
            val edit=sharedPreferences2.edit()
            edit.apply{
                putBoolean("konfigurisanje", !savedBoolean2)
            }.apply()
            val intent = Intent(this,DistribuiranjeAplikacije::class.java)
            intent.putExtra("konfigurisanjebt",true)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,DistribuiranjeAplikacije::class.java)
            startActivity(intent)

        }
    }
}