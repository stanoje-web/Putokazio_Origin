package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ToggleButton

class NapraviProjekat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_napravi_projekat)
        val boolean2 =findViewById<ToggleButton>(R.id.toggleButtonDrawable1)
        val sharedPreferences2=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean2=sharedPreferences2.getBoolean("napraviprojekat", false)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        boolean2.isChecked=savedBoolean2
        boolean2.setOnCheckedChangeListener { _, isChecked ->
            val edit=sharedPreferences2.edit()
            edit.apply{
                putBoolean("napraviprojekat", !savedBoolean2)
            }.apply()
            val intent = Intent(this,NapraviAplikaciju::class.java)
            intent.putExtra("napraviprojekatbt",true)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,NapraviAplikaciju::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,NapraviAplikaciju::class.java)
        startActivity(intent)
    }
}