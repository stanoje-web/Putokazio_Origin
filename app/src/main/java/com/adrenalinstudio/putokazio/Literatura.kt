package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageButton
import android.widget.TextView

class Literatura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_literatura)
        val back=findViewById<ImageButton>(R.id.imageButton7)
        back.setOnClickListener {
            val intent= Intent(this,HomeActivitz::class.java)
            startActivity(intent)

        }
        val textView1=findViewById<TextView>(R.id.textView16)
        val textView2=findViewById<TextView>(R.id.textView17)
        val textView3=findViewById<TextView>(R.id.textView18)
        val textView4=findViewById<TextView>(R.id.textView19)
        val textView5=findViewById<TextView>(R.id.textView20)
        textView1.movementMethod = LinkMovementMethod.getInstance()
        textView2.movementMethod = LinkMovementMethod.getInstance()
        textView3.movementMethod = LinkMovementMethod.getInstance()
        textView4.movementMethod = LinkMovementMethod.getInstance()
        textView5.movementMethod = LinkMovementMethod.getInstance()
    }
    override fun onBackPressed() {
        val intent=Intent(this,HomeActivitz::class.java)
        startActivity(intent)
    }
}