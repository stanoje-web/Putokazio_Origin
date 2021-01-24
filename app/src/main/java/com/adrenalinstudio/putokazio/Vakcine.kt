package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageButton
import android.widget.TextView
import android.widget.ToggleButton

class Vakcine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vakcine)
        val textView=findViewById<TextView>(R.id.textView15)
        textView.movementMethod = LinkMovementMethod.getInstance()
        val boolean2 =findViewById<ToggleButton>(R.id.toggleButtonDrawable1)
        val sharedPreferences2=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean2=sharedPreferences2.getBoolean("vakcine", false)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        boolean2.isChecked=savedBoolean2
        boolean2.setOnCheckedChangeListener { _, isChecked ->
            val edit=sharedPreferences2.edit()
            edit.apply{
                putBoolean("vakcine", !savedBoolean2)
            }.apply()
            val intent = Intent(this,Covid19::class.java)
            intent.putExtra("vakcinebt",true)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,Covid19::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        val intent=Intent(this,Covid19::class.java)
        startActivity(intent)
    }
}