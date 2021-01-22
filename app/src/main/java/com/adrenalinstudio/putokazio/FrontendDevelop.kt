package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class FrontendDevelop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontend_develop)
        val back = findViewById<ImageButton>(R.id.imageButton1)
        val internet = findViewById<Button>(R.id.button1)
        val html = findViewById<Button>(R.id.button15)
        val css = findViewById<Button>(R.id.button16)
        val javascript = findViewById<Button>(R.id.button17)
        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean = sharedPreferences.getBoolean("toggleButton", false)
        val savedBoolean2 = sharedPreferences.getBoolean("http", false)
        val savedBoolean3 = sharedPreferences.getBoolean("browser", false)
        val savedBoolean4 = sharedPreferences.getBoolean("dns", false)
        val savedBoolean5 = sharedPreferences.getBoolean("domen", false)
        val savedBoolean6 = sharedPreferences.getBoolean("hosting", false)
        val savedBoolean7 = sharedPreferences.getBoolean("html", false)
        val savedBoolean8 = sharedPreferences.getBoolean("css", false)
        val savedBoolean9 = sharedPreferences.getBoolean("javascript", false)
        val button3 = intent.getBooleanExtra("httpbt", false)
        val button4 = intent.getBooleanExtra("browserbt", false)
        val button5 = intent.getBooleanExtra("dnsbt", false)
        val button6 = intent.getBooleanExtra("domenbt", false)
        val button7 = intent.getBooleanExtra("hostingbt", false)
        val button8 = intent.getBooleanExtra("htmlbt", false)
        val button9 = intent.getBooleanExtra("cssbt", false)
        val button10 = intent.getBooleanExtra("javascriptbt", false)
        back.setOnClickListener {
            val intent = Intent(this, SveMape::class.java)
            startActivity(intent)

        }
        internet.setOnClickListener {
            val intent = Intent(this, Internet2::class.java)
            startActivity(intent)

        }
        html.setOnClickListener {
            val intent = Intent(this, HTML::class.java)
            startActivity(intent)

        }
        css.setOnClickListener {
            val intent = Intent(this, CSS::class.java)
            startActivity(intent)

        }
        javascript.setOnClickListener {
            val intent = Intent(this, JavaScript::class.java)
            startActivity(intent)

        }
        val button2 = intent.getBooleanExtra("Username", false)

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
            html.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }
        if (savedBoolean8 == true) {
            css.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }
        if (savedBoolean9 == true) {
            javascript.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {
        }


    }

    override fun onBackPressed() {
        val intent = Intent(this, SveMape::class.java)
        startActivity(intent)

    }
}
