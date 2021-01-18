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
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean=sharedPreferences.getBoolean("najnovijikernel", false)
        val savedBoolean2=sharedPreferences.getBoolean("prilagođavanjekernela", false)
        val savedBoolean3=sharedPreferences.getBoolean("konfiguracijskimeni", false)
        val savedBoolean4=sharedPreferences.getBoolean("uređajizaskladištenja", false)
        val najnovijiKernel=findViewById<Button>(R.id.button20)
        val prilagodjavanjekernela=findViewById<Button>(R.id.button21)
        val konfiguracijskiMenibrt=findViewById<Button>(R.id.button22)
        val uredjajizaskladistenjebrt=findViewById<Button>(R.id.button9)
        val back=findViewById<ImageButton>(R.id.imageButton1)
        val najnovijiKernelbt=intent.getBooleanExtra("tvoraclinuxabt",false)
        val prilagodjavanjekernelabt=intent.getBooleanExtra("istorijalinuxabt",false)
        val konfiguracijskiMenibt=intent.getBooleanExtra("linuxdanasbt",false)
        val uredjajizaskladistenjebt=intent.getBooleanExtra("linuxdanasbt",false)
        najnovijiKernel.setOnClickListener {
            val intent= Intent(this,NajnovijiKernel::class.java)
            startActivity(intent)
        }
        prilagodjavanjekernela.setOnClickListener {
            val intent= Intent(this,PrilagodjavanjeKernela::class.java)
            startActivity(intent)
        }
        konfiguracijskiMenibrt.setOnClickListener {
            val intent= Intent(this,KonfiguracijskiMeni::class.java)
            startActivity(intent)
        }
        uredjajizaskladistenjebrt.setOnClickListener {
            val intent= Intent(this,UredjajizaSkladistenje::class.java)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent= Intent(this,LinuxServeri::class.java)
            startActivity(intent)

        }
    }
}