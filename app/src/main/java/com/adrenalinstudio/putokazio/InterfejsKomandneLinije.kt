package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InterfejsKomandneLinije : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfejs_komandne_linije)
        val navigacionekomandebt=findViewById<Button>(R.id.button20)
        val kreiranjefajlovabt=findViewById<Button>(R.id.button21)
        val upravljanjefajlovimabt=findViewById<Button>(R.id.button22)
        val vieditorbt=findViewById<Button>(R.id.button9)
        navigacionekomandebt.setOnClickListener {
            val intent= Intent(this,NavigacioneKomande::class.java)
            startActivity(intent)
        }
        kreiranjefajlovabt.setOnClickListener {
            val intent= Intent(this,KreiranjeFajlova::class.java)
            startActivity(intent)
        }
        upravljanjefajlovimabt.setOnClickListener {
            val intent= Intent(this,UpravljanjeFajlovima::class.java)
            startActivity(intent)
        }
        vieditorbt.setOnClickListener {
            val intent= Intent(this,ViEditor::class.java)
            startActivity(intent)
        }
    }
}