package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ToggleButton

class OperativniSistemAnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operativni_sistem_and)
        val boolean2 =findViewById<ToggleButton>(R.id.toggleButtonDrawable1)
        val sharedPreferences3=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean3=sharedPreferences3.getBoolean("OS", false)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        boolean2.isChecked=savedBoolean3
        boolean2.setOnCheckedChangeListener { _, isChecked ->
            val edit=sharedPreferences3.edit()
            edit.apply{
                putBoolean("OS", !savedBoolean3)
            }.apply()
            val intent = Intent(this,UvodUAndroid::class.java)
            intent.putExtra("OSbt",true)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,UvodUAndroid::class.java)
            startActivity(intent)

        }
    }
}