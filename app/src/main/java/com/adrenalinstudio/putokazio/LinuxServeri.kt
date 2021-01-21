package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
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
        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean = sharedPreferences.getBoolean("tvoraclinuxa", false)
        val savedBoolean2 = sharedPreferences.getBoolean("istorijalinuxa", false)
        val savedBoolean3 = sharedPreferences.getBoolean("linuxdanas", false)
        val savedBoolean4 = sharedPreferences.getBoolean("pdf", false)
        val savedBoolean5 = sharedPreferences.getBoolean("prikazivacislika", false)
        val savedBoolean6 = sharedPreferences.getBoolean("gimp", false)
        val savedBoolean7 = sharedPreferences.getBoolean("colorchooser", false)
        val savedBoolean8 = sharedPreferences.getBoolean("kreiranjefajlova", false)
        val savedBoolean9 = sharedPreferences.getBoolean("navigacionekomande", false)
        val savedBoolean10 = sharedPreferences.getBoolean("vieditor", false)
        val savedBoolean11 = sharedPreferences.getBoolean("upravljanjefajlovima",false)
        val savedBoolean12 = sharedPreferences.getBoolean("najnovijikernel", false)
        val savedBoolean13 = sharedPreferences.getBoolean("prilagođavanjekernela", false)
        val savedBoolean14 = sharedPreferences.getBoolean("konfiguracijskimeni", false)
        val savedBoolean15 = sharedPreferences.getBoolean("uređajizaskladištenja",false)
        val button2 = intent.getBooleanExtra("tvoraclinuxabt", false)
        val button3 = intent.getBooleanExtra("istorijalinuxabt", false)
        val button4 = intent.getBooleanExtra("istorijalinuxabt", false)
        val button5 = intent.getBooleanExtra("pdfbt", false)
        val button6 = intent.getBooleanExtra("prikazivacislikabt", false)
        val button7 = intent.getBooleanExtra("gimpbt", false)
        val button8 = intent.getBooleanExtra("colorchooserbt", false)
        val button9 = intent.getBooleanExtra("kreiranjefajlovabt", false)
        val button11 = intent.getBooleanExtra("navigacionekomandebt", false)
        val button12 = intent.getBooleanExtra("vieditorbt", false)
        val button13= intent.getBooleanExtra("upravljanjefajlovimabt", false)
        val button14 = intent.getBooleanExtra("najnovijikernelbt", false)
        val button15= intent.getBooleanExtra("prilagođavanjekernelabt", false)
        val button16 = intent.getBooleanExtra("konfiguracijskimenibt", false)
        val button17 = intent.getBooleanExtra("uređajizaskladištenjabt", false)
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
        if (savedBoolean == true) {
            olinuxu.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean2 == true) {
            olinuxu.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean3 == true) {
            olinuxu.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean == true) {
            if (savedBoolean2 == true) {
                if (savedBoolean3 == true) {

                    olinuxu.setBackgroundColor(Color.rgb(89, 171, 43))
                }
            }

        } else {
        }
        back.setOnClickListener {
            val intent = Intent(this, SveMape::class.java)
            startActivity(intent)
        }
        if (savedBoolean4 == true) {
            grafickiprogrami.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean5 == true) {
            grafickiprogrami.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean6 == true) {
            grafickiprogrami.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean7 == true) {
            grafickiprogrami.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean4 == true) {
            if (savedBoolean5 == true) {
                if (savedBoolean6 == true) {
                    if (savedBoolean7 == true) {

                        grafickiprogrami.setBackgroundColor(Color.rgb(89, 171, 43))
                            }
                        }
                    }
                }


        else {
        }
        if (savedBoolean8 == true) {
            interfejs.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean9 == true) {
            interfejs.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean10 == true) {
            interfejs.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean11 == true) {
            interfejs.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }

        if (savedBoolean8 == true) {
            if (savedBoolean9 == true) {
                if (savedBoolean10 == true) {
                    if (savedBoolean11 == true) {
                        interfejs.setBackgroundColor(Color.rgb(89, 171, 43))
                        }
                    }
                }
            }
         else {


        }
        if (savedBoolean12 == true) {
            kernel.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean13 == true) {
            kernel.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean14 == true) {
            kernel.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean15 == true) {
            kernel.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean12 == true) {
            if (savedBoolean13 == true) {
                if (savedBoolean14 == true) {
                    if (savedBoolean15 == true) {
                        kernel.setBackgroundColor(Color.rgb(89, 171, 43))
                    }
                }
            }
        }
        else {
        }


    }
    override fun onBackPressed() {
        val intent=Intent(this,SveMape::class.java)
        startActivity(intent)
    }
}