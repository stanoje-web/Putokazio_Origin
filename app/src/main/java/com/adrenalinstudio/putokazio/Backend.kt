package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Backend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backend)
        val internet = findViewById<Button>(R.id.button1)
        val phpbt = findViewById<Button>(R.id.button12)
        val csharp = findViewById<Button>(R.id.button13)
        val sqlbt = findViewById<Button>(R.id.button18)
        val back = findViewById<ImageButton>(R.id.imageButton1)
        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean = sharedPreferences.getBoolean("toggleButton", false)
        val savedBoolean2 = sharedPreferences.getBoolean("http", false)
        val savedBoolean3 = sharedPreferences.getBoolean("browser", false)
        val savedBoolean4 = sharedPreferences.getBoolean("dns", false)
        val savedBoolean5 = sharedPreferences.getBoolean("domen", false)
        val savedBoolean6 = sharedPreferences.getBoolean("hosting", false)
        val savedBoolean7 = sharedPreferences.getBoolean("php", false)
        val savedBoolean8 = sharedPreferences.getBoolean("csharp", false)
        val savedBoolean9 = sharedPreferences.getBoolean("sql", false)
        val button2 = intent.getBooleanExtra("Username", false)
        val button3 = intent.getBooleanExtra("httpbt", false)
        val button4 = intent.getBooleanExtra("browserbt", false)
        val button5 = intent.getBooleanExtra("dnsbt", false)
        val button6 = intent.getBooleanExtra("domenbt", false)
        val button7 = intent.getBooleanExtra("hostingbt", false)
        val button8 = intent.getBooleanExtra("phpbt", false)
        val button9 = intent.getBooleanExtra("csharpbt", false)
        val button10 = intent.getBooleanExtra("sqlbt", false)
        internet.setOnClickListener {
            val intent = Intent(this, Internet3::class.java)
            startActivity(intent)

        }
        phpbt.setOnClickListener {
            val intent = Intent(this, php::class.java)
            startActivity(intent)

        }
        csharp.setOnClickListener {
            val intent = Intent(this, CSharp::class.java)
            startActivity(intent)

        }
        sqlbt.setOnClickListener {
            val intent = Intent(this, sql::class.java)
            startActivity(intent)

        }
        back.setOnClickListener {
            val intent = Intent(this, SveMape::class.java)
            startActivity(intent)

        }
        if (savedBoolean == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean2 == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean3 == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean4 == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean5 == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean6 == true) {
            internet.setBackgroundColor(Color.rgb(42, 88, 137))
        } else {
        }
        if (savedBoolean == true) {
            if (savedBoolean2 == true) {
                if (savedBoolean3 == true) {
                    if (savedBoolean4 == true) {
                        if (savedBoolean5 == true) {
                            if (savedBoolean6 == true) {
                                internet.setBackgroundColor(Color.rgb(89, 171, 43))
                            }
                        }
                    }
                }
            }

        } else {
        }
        if (savedBoolean7 == true) {
            phpbt.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }
        if (savedBoolean8 == true) {
            csharp.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }
        if (savedBoolean9 == true) {
            sqlbt.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }

    }
    override fun onBackPressed() {
        val intent = Intent(this, SveMape::class.java)
        startActivity(intent)

    }
}