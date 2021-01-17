package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class androidale : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_androidale)
        val uvodUandroid = findViewById<Button>(R.id.button1)
        val androidstd = findViewById<Button>(R.id.button12)
        val napapp = findViewById<Button>(R.id.button13)
        val distribuiranje = findViewById<Button>(R.id.button18)
        val ukratkobt = findViewById<Button>(R.id.button19)
        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean = sharedPreferences.getBoolean("istorija2", false)
        val savedBoolean2 = sharedPreferences.getBoolean("ukratko", false)
        val savedBoolean3 = sharedPreferences.getBoolean("OS", false)
        val savedBoolean4 = sharedPreferences.getBoolean("podesavanja", false)
        val savedBoolean5 = sharedPreferences.getBoolean("cfg", false)
        val savedBoolean6 = sharedPreferences.getBoolean("java", false)
        val savedBoolean7 = sharedPreferences.getBoolean("kotlin", false)
        val savedBoolean8 = sharedPreferences.getBoolean("gradle", false)
        val savedBoolean9 = sharedPreferences.getBoolean("ukratko2", false)
        val savedBoolean10 = sharedPreferences.getBoolean("napraviprojekat", false)
        val savedBoolean11 = sharedPreferences.getBoolean("napraviavd",false)
        val savedBoolean12 = sharedPreferences.getBoolean("sadrzaj", false)
        val savedBoolean13 = sharedPreferences.getBoolean("intent", false)
        val savedBoolean14 = sharedPreferences.getBoolean("ukratko3", false)
        val savedBoolean15 = sharedPreferences.getBoolean("priprema",false)
        val savedBoolean16 = sharedPreferences.getBoolean("konfigurisanje", false)
        val savedBoolean17 = sharedPreferences.getBoolean("appzaobj", false)
        val savedBoolean18 = sharedPreferences.getBoolean("ukratko4", false)
        val savedBoolean19 = sharedPreferences.getBoolean("ukratko5", false)
        val back = findViewById<ImageButton>(R.id.imageButton1)
        uvodUandroid.setOnClickListener {
            val intent = Intent(this, UvodUAndroid::class.java)
            startActivity(intent)
        }
        androidstd.setOnClickListener {
            val intent = Intent(this, Androidstd::class.java)
            startActivity(intent)
        }
        napapp.setOnClickListener {
            val intent = Intent(this, NapraviAplikaciju::class.java)
            startActivity(intent)
        }
        distribuiranje.setOnClickListener {
            val intent = Intent(this, DistribuiranjeAplikacije::class.java)
            startActivity(intent)
        }
        ukratkobt.setOnClickListener {
            val intent = Intent(this, Ukratko5::class.java)
            startActivity(intent)
        }
        val button2 = intent.getBooleanExtra("Usernamebt", false)
        val button3 = intent.getBooleanExtra("ukratkobt", false)
        val button4 = intent.getBooleanExtra("OSbt", false)
        val button5 = intent.getBooleanExtra("podesavanjabt", false)
        val button6 = intent.getBooleanExtra("cfgbt", false)
        val button7 = intent.getBooleanExtra("javabt", false)
        val button8 = intent.getBooleanExtra("kotlinbt", false)
        val button9 = intent.getBooleanExtra("gradlebt", false)
        val button10 = intent.getBooleanExtra("ukratko2bt", false)
        val napraviprojekatbt = intent.getBooleanExtra("napraviprojekatbt", false)
        val napraviavdbt = intent.getBooleanExtra("napraviavdbt", false)
        val sadrzajbt = intent.getBooleanExtra("sadrzajbt", false)
        val intentbt = intent.getBooleanExtra("intentbt", false)
        val ukratko3bt = intent.getBooleanExtra("ukratko3bt", false)
        val button11 = intent.getBooleanExtra("pripremabt", false)
        val button12= intent.getBooleanExtra("konfigurisanjebt", false)
        val button13 = intent.getBooleanExtra("appzaobjbt", false)
        val button14 = intent.getBooleanExtra("ukratko4bt", false)
        val button15 = intent.getBooleanExtra("ukratko5bt", false)


        if (savedBoolean == true) {
            uvodUandroid.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean2 == true) {
            uvodUandroid.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean3 == true) {
            uvodUandroid.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean == true) {
            if (savedBoolean2 == true) {
                if (savedBoolean3 == true) {

                    uvodUandroid.setBackgroundColor(Color.rgb(89, 171, 43))
                }
            }

        } else {
        }
        back.setOnClickListener {
            val intent = Intent(this, SveMape::class.java)
            startActivity(intent)
        }
        if (savedBoolean4 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean5 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean6 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean7 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean8 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean9 == true) {
            androidstd.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean4 == true) {
            if (savedBoolean5 == true) {
                if (savedBoolean6 == true) {
                    if (savedBoolean7 == true) {
                        if (savedBoolean8 == true) {
                            if (savedBoolean9 == true) {
                                androidstd.setBackgroundColor(Color.rgb(89, 171, 43))
                            }
                        }
                    }
                }
            }

        } else {
        }
        if (savedBoolean10 == true) {
            napapp.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean11 == true) {
            napapp.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean12 == true) {
            napapp.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean13 == true) {
            napapp.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean14 == true) {
            napapp.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }

        if (savedBoolean10 == true) {
            if (savedBoolean11 == true) {
                if (savedBoolean12 == true) {
                    if (savedBoolean13 == true) {
                        if (savedBoolean14 == true) {
                            napapp.setBackgroundColor(Color.rgb(89, 171, 43))
                        }
                    }
                }
            }
        } else {


        }

        if (savedBoolean15 == true) {
            distribuiranje.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean16 == true) {
            distribuiranje.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean17 == true) {
            distribuiranje.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean18 == true) {
            distribuiranje.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }

        if (savedBoolean15 == true) {
                if (savedBoolean16 == true) {
                    if (savedBoolean17 == true) {
                        if (savedBoolean18 == true) {
                            distribuiranje.setBackgroundColor(Color.rgb(89, 171, 43))
                        }
                    }
                }
            }
         else {


        }
        if (savedBoolean19 == true) {
            ukratkobt.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }
    }
    }
