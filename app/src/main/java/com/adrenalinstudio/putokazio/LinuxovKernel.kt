package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LinuxovKernel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linuxov_kernel2)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        back.setOnClickListener {
            val intent= Intent(this,LinuxServeri::class.java)
            startActivity(intent)
        }
    }
}