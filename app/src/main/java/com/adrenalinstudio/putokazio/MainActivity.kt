package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({
              //  val intent = Intent(this@MainActivity,HomeActivitz::class.java)
                //startActivity(intent)

            startActivity(Intent(this,HomeActivitz::class.java))

            finish()
            },3000)
    }
}




