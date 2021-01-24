package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Internet3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet3)
        val back = findViewById<ImageButton>(R.id.imageButton3)
        val kakoRadiInternet = findViewById<Button>(R.id.button1)
        val http = findViewById<Button>(R.id.button2)
        val browser = findViewById<Button>(R.id.button3)
        val dnsbt = findViewById<Button>(R.id.button5)
        val domen = findViewById<Button>(R.id.button4)
        val hosting = findViewById<Button>(R.id.button14)
        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)
        val savedBoolean = sharedPreferences.getBoolean("toggleButton", false)
        val savedBoolean2 = sharedPreferences.getBoolean("http", false)
        val savedBoolean3 = sharedPreferences.getBoolean("browser", false)
        val savedBoolean4 = sharedPreferences.getBoolean("dns", false)
        val savedBoolean5 = sharedPreferences.getBoolean("domen", false)
        val savedBoolean6 = sharedPreferences.getBoolean("hosting", false)

        back.setOnClickListener {
            val intent = Intent(this, Backend::class.java)
            startActivity(intent)

        }
        kakoRadiInternet.setOnClickListener {
            val intent = Intent(this, KakoRadiInternet::class.java)
            startActivity(intent)

        }
        http.setOnClickListener {
            val intent = Intent(this, HTTP::class.java)
            startActivity(intent)

        }
        browser.setOnClickListener {
            val intent = Intent(this, Browser::class.java)
            startActivity(intent)

        }
        dnsbt.setOnClickListener {
            val intent = Intent(this, dns::class.java)
            startActivity(intent)

        }
        domen.setOnClickListener {
            val intent = Intent(this, Domen::class.java)
            startActivity(intent)

        }
        hosting.setOnClickListener {
            val intent = Intent(this, Hosting::class.java)
            startActivity(intent)

        }
        val buttonjbg = intent.getBooleanExtra("Username", false)
        if (savedBoolean == true) {
            kakoRadiInternet.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
        if (savedBoolean2 == true) {
            http.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
        if (savedBoolean3 == true) {
            browser.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
        if (savedBoolean4 == true) {
            dnsbt.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
        if (savedBoolean5 == true) {
            domen.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
        if (savedBoolean6 == true) {
            hosting.setBackgroundColor(Color.rgb(89, 171, 43))
        } else {

        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, FrontendDevelop::class.java)
        startActivity(intent)


    }
    }