package com.adrenalinstudio.putokazio

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sve_mape2.*

class SveMape : AppCompatActivity() {
    private var progr = 0
    private var progr1 = 0
    private var progr2 = 0
    private var progr3 = 0
    private var progr4 = 0
    private var progr5 = 0
    private var progr6 = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        window.setBackgroundDrawableResource(R.drawable.ic_pozadina)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sve_mape)

        val imageButton=findViewById<ImageButton>(R.id.imageButton1)
        val progressBar1=findViewById<ProgressBar>(R.id.progressBar1)
        val textView69=findViewById<TextView>(R.id.textView5)
        val progressBar2=findViewById<ProgressBar>(R.id.progressBar3)
        val progressBar3=findViewById<ProgressBar>(R.id.progressBar4)
        val progressBar4=findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar5=findViewById<ProgressBar>(R.id.progressBar6)
        val progressBar6=findViewById<ProgressBar>(R.id.progressBar5)
        val progressBar7=findViewById<ProgressBar>(R.id.progressBar7)
        val textView70=findViewById<TextView>(R.id.textView3)
        val textView68=findViewById<TextView>(R.id.textView11)
        val textView67=findViewById<TextView>(R.id.textView16)
        val textView66=findViewById<TextView>(R.id.textView20)
        val textView65=findViewById<TextView>(R.id.textView7)
        val textView64=findViewById<TextView>(R.id.textView22)
        val searchView1=findViewById<SearchView>(R.id.searchView)
        val frontendbut=findViewById<Button>(R.id.button)
        val androidbut=findViewById<Button>(R.id.button1)

        frontendbut.setOnClickListener {
            val intent=Intent(this, FrontendDevelop::class.java)
            startActivity(intent)
        }
       androidbut.setOnClickListener {
           val intent2=Intent(this, androidale::class.java)
           startActivity(intent2)
       }
        val sharedPreferences=getSharedPreferences("sharedPref", MODE_PRIVATE)

        progressBar1.progress=progr
        textView70.text="$progr%"
        progressBar2.progress=progr1
        textView69.text="$progr1%"
        progressBar3.progress=progr2
        textView68.text="$progr2%"
        progressBar4.progress=progr3
        textView67.text="$progr3%"
        progressBar5.progress=progr4
        textView66.text="$progr4%"
        progressBar6.progress=progr5
        textView65.text="$progr5%"
        progressBar7.progress=progr6
        textView64.text="$progr6%"

        imageButton.setOnClickListener {
            val intent3=Intent(this, HomeActivitz::class.java)
            startActivity(intent3)
        }
        val savedBoolean7=sharedPreferences.getBoolean("toggleButton", false)
        val buttonkri2=intent.getBooleanExtra("Username", false)
        if(savedBoolean7==true) {
            progressBar2.progress=progr1+3
            progr1=progr1+3
            textView69.text="$progr1%"

        }
        else
        {


        }
        val savedBoolean6=sharedPreferences.getBoolean("OS", false)
        val buttonkri3=intent.getBooleanExtra("OSbt", false)
        if(savedBoolean6==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean8=sharedPreferences.getBoolean("istorija2", false)
        val buttonkri=intent.getBooleanExtra("Usernamebt", false)
        if(savedBoolean8==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }

        val savedBoolean10=sharedPreferences.getBoolean("ukratko", false)
        val buttonkri5=intent.getBooleanExtra("ukratkobt", false)
        if(savedBoolean10==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean11=sharedPreferences.getBoolean("podesavanja", false)
        val buttonkri6=intent.getBooleanExtra("podesavanjabt", false)
        if(savedBoolean11==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean12=sharedPreferences.getBoolean("cfg", false)
        val buttonkri7=intent.getBooleanExtra("cfgbt", false)
        if(savedBoolean12==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean13=sharedPreferences.getBoolean("java", false)
        val buttonkri8=intent.getBooleanExtra("javabt", false)
        if(savedBoolean13==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }

        val savedBoolean15=sharedPreferences.getBoolean("kotlin", false)
        val buttonkri9=intent.getBooleanExtra("kotlinbt", false)
        if(savedBoolean15==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean16=sharedPreferences.getBoolean("gradle", false)
        val buttonkri10=intent.getBooleanExtra("gradlebt", false)
        if(savedBoolean16==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean17=sharedPreferences.getBoolean("ukratko2", false)
        val buttonkri11=intent.getBooleanExtra("ukratko2bt", false)
        if(savedBoolean17==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean18=sharedPreferences.getBoolean("napraviprojekat", false)
        val buttonkri12=intent.getBooleanExtra("napraviprojekatbt", false)
        if(savedBoolean18==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean19=sharedPreferences.getBoolean("napraviavd", false)
        val buttonkri13=intent.getBooleanExtra("napraviavdbt", false)
        if(savedBoolean19==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }

        val savedBoolean20=sharedPreferences.getBoolean("sadrzaj", false)
        val buttonkri14=intent.getBooleanExtra("sadrzajbt", false)
        if(savedBoolean20==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean21=sharedPreferences.getBoolean("intent", false)
        val buttonkri15=intent.getBooleanExtra("intentbt", false)
        if(savedBoolean21==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean22=sharedPreferences.getBoolean("ukratko3", false)
        val buttonkri16=intent.getBooleanExtra("ukratko3bt", false)
        if(savedBoolean22==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean23=sharedPreferences.getBoolean("priprema", false)
        val buttonkri17=intent.getBooleanExtra("pripremabt", false)
        if(savedBoolean23==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }

        val savedBoolean24=sharedPreferences.getBoolean("konfigurisanje", false)
        val buttonkri18=intent.getBooleanExtra("konfigurisanjebt", false)
        if(savedBoolean24==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean25=sharedPreferences.getBoolean("appzaobj", false)
        val buttonkri19=intent.getBooleanExtra("appzaobjbt", false)
        if(savedBoolean25==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean26=sharedPreferences.getBoolean("ukratko4", false)
        val buttonkri20=intent.getBooleanExtra("ukratko4bt", false)
        if(savedBoolean26==true) {
            progressBar5.progress=progr4+5
            progr4=progr4+5
            textView66.text="$progr4%"

        }
        else
        {


        }
        val savedBoolean27=sharedPreferences.getBoolean("ukratko5", false)
        val buttonkri21=intent.getBooleanExtra("ukratko5bt", false)
        if(savedBoolean27==true) {
            progressBar5.progress=progr4+10
            progr4=progr4+10
            textView66.text="$progr4%"

        }
        else
        {


        }

        
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {

                Toast.makeText(this@SveMape, p0, Toast.LENGTH_SHORT).show()
                //Performs search when user hit the search button on the keyboard
                if (p0.equals("frontend") or p0.equals("Frontend") or p0.equals("Frontend Developer") or p0.equals(
                        "frontend developer"
                    )
                ) {
                    val intent = Intent(this@SveMape, FrontendDevelop::class.java)
                    startActivity(intent)

                } else if (p0.equals("Kako radi internet") or p0.equals("kako radi internet")) {

                    val intent = Intent(this@SveMape, KakoRadiInternet::class.java)
                    startActivity(intent)

                } else if (p0.equals("Android") or p0.equals("android") or p0.equals("Android Developer") or p0.equals(
                        "android developer"
                    )
                ) {

                    val intent = Intent(this@SveMape, androidale::class.java)
                    startActivity(intent)

                } else if (p0.equals("Uvod u android") or p0.equals("Uvod u Android") or p0.equals("uvod u android") or p0.equals(
                        "uvod u Android"
                    )
                ) {

                    val intent = Intent(this@SveMape, UvodUAndroid::class.java)
                    startActivity(intent)

                } else if (p0.equals("Android Studio") or p0.equals("Android studio") or p0.equals("android studio")) {

                    val intent = Intent(this@SveMape, Androidstd::class.java)
                    startActivity(intent)

                } else if (p0.equals("Napravi aplikaciju") or p0.equals("napravi aplikaciju")) {

                    val intent = Intent(this@SveMape, NapraviAplikaciju::class.java)
                    startActivity(intent)

                } else if (p0.equals("Distribuiranje Aplikacije") or p0.equals("distribuiranje aplikacije") or p0.equals(
                        "distribuiranje "
                    ) or p0.equals("Distribuiranje")
                ) {

                    val intent = Intent(this@SveMape, DistribuiranjeAplikacije::class.java)
                    startActivity(intent)

                } else if (p0.equals("Ukratko Android") or p0.equals("Android ukratko") or p0.equals(
                        "ukratko android"
                    )
                ) {

                    val intent = Intent(this@SveMape, Ukratko5::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this@SveMape, "Nema traženog rezultata", Toast.LENGTH_SHORT)
                        .show()
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                //Start filtering the list as user start entering the characters
                //  adapter.filter.filter(p0)
                return false
            }
        })

    }
}
    














