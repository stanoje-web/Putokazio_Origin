package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class GrafickiProgrami : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graficki_programi)
        val pdf=findViewById<Button>(R.id.button20)
        val prikazivacislika=findViewById<Button>(R.id.button21)
        val gimp=findViewById<Button>(R.id.button22)
        val colorchooser=findViewById<Button>(R.id.button9)

        val back=findViewById<ImageButton>(R.id.imageButton1)
        back.setOnClickListener {
            val intent= Intent(this,LinuxServeri::class.java)
            startActivity(intent)
        }
        pdf.setOnClickListener {
            val intent= Intent(this,PDFViewer::class.java)
            startActivity(intent)
        }
        prikazivacislika.setOnClickListener {
            val intent= Intent(this,PrikazivaciSlika::class.java)
            startActivity(intent)
        }
        gimp.setOnClickListener {
            val intent= Intent(this,GIMP::class.java)
            startActivity(intent)
        }
        colorchooser.setOnClickListener {
            val intent= Intent(this,ColorChooser::class.java)
            startActivity(intent)
        }
    }
}