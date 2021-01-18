package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LinuxovKernel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linuxov_kernel2)
        val najnovijiKernel=findViewById<Button>(R.id.button20)
        val prilagodjavanjekernela=findViewById<Button>(R.id.button21)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        najnovijiKernel.setOnClickListener {
            val intent= Intent(this,NajnovijiKernel::class.java)
            startActivity(intent)
        }
        prilagodjavanjekernela.setOnClickListener {
            val intent= Intent(this,PrilagodjavanjeKernela::class.java)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,LinuxServeri::class.java)
            startActivity(intent)

        }
    }
}