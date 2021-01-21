package com.adrenalinstudio.putokazio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class Vakcine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vakcine)
        val textView=findViewById<TextView>(R.id.textView15)
        textView.movementMethod = LinkMovementMethod.getInstance()
    }
}