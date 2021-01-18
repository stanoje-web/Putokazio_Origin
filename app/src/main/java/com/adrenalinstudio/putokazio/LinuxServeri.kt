package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LinuxServeri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linux_serveri)
        val olinuxu=findViewById<Button>(R.id.button20)
        val interfejs=findViewById<Button>(R.id.button21)
        val grafickiprogrami=findViewById<Button>(R.id.button22)
        val kernel=findViewById<Button>(R.id.button6)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        olinuxu.setOnClickListener {
            val intent= Intent(this,Olinuxu::class.java)
            startActivity(intent)
        }
        interfejs.setOnClickListener {
            val intent= Intent(this,InterfejsKomandneLinije::class.java)
            startActivity(intent)
        }
        grafickiprogrami.setOnClickListener {
            val intent= Intent(this,GrafickiProgrami::class.java)
            startActivity(intent)
        }
        kernel.setOnClickListener {
            val intent= Intent(this,LinuxovKernel::class.java)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent=Intent(this,SveMape::class.java)
            startActivity(intent)
        }


    }
}