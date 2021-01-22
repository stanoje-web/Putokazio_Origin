
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

        val imageButton = findViewById<ImageButton>(R.id.imageButton1)
        val progressBar1 = findViewById<ProgressBar>(R.id.progressBar1)
        val textView69 = findViewById<TextView>(R.id.textView5)
        val progressBar2 = findViewById<ProgressBar>(R.id.progressBar3)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar4)
        val progressBar4 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar5 = findViewById<ProgressBar>(R.id.progressBar6)
        val progressBar6 = findViewById<ProgressBar>(R.id.progressBar5)
        val progressBar7 = findViewById<ProgressBar>(R.id.progressBar7)
        val textView70 = findViewById<TextView>(R.id.textView3)
        val textView68 = findViewById<TextView>(R.id.textView11)
        val textView67 = findViewById<TextView>(R.id.textView16)
        val textView66 = findViewById<TextView>(R.id.textView20)
        val textView65 = findViewById<TextView>(R.id.textView7)
        val textView64 = findViewById<TextView>(R.id.textView22)
        val searchView1 = findViewById<SearchView>(R.id.searchView)
        val frontendbut = findViewById<Button>(R.id.button)
        val androidbut = findViewById<Button>(R.id.button1)
        val linuxbt = findViewById<Button>(R.id.button3)
        val coronabt = findViewById<Button>(R.id.button24)

        frontendbut.setOnClickListener {
            val intent = Intent(this, FrontendDevelop::class.java)
            startActivity(intent)
        }
        androidbut.setOnClickListener {
            val intent = Intent(this, androidale::class.java)
            startActivity(intent)
        }
        linuxbt.setOnClickListener {
            val intent = Intent(this, LinuxServeri::class.java)
            startActivity(intent)
        }
        coronabt.setOnClickListener {
            val intent = Intent(this, Covid19::class.java)
            startActivity(intent)
        }

        val sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE)

        progressBar1.progress = progr
        textView70.text = "$progr%"
        progressBar2.progress = progr1
        textView69.text = "$progr1%"
        progressBar3.progress = progr2
        textView68.text = "$progr2%"
        progressBar4.progress = progr3
        textView67.text = "$progr3%"
        progressBar5.progress = progr4
        textView66.text = "$progr4%"
        progressBar6.progress = progr5
        textView65.text = "$progr5%"
        progressBar7.progress = progr6
        textView64.text = "$progr6%"

        imageButton.setOnClickListener {
            val intent3 = Intent(this, HomeActivitz::class.java)
            startActivity(intent3)
        }
        val savedBoolean7 = sharedPreferences.getBoolean("toggleButton", false)
        val buttonkri2 = intent.getBooleanExtra("Username", false)
        if (savedBoolean7 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean6 = sharedPreferences.getBoolean("OS", false)
        val buttonkri3 = intent.getBooleanExtra("OSbt", false)
        if (savedBoolean6 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean8 = sharedPreferences.getBoolean("istorija2", false)
        val buttonkri = intent.getBooleanExtra("Usernamebt", false)
        if (savedBoolean8 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }

        val savedBoolean10 = sharedPreferences.getBoolean("ukratko", false)
        val buttonkri5 = intent.getBooleanExtra("ukratkobt", false)
        if (savedBoolean10 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean11 = sharedPreferences.getBoolean("podesavanja", false)
        val buttonkri6 = intent.getBooleanExtra("podesavanjabt", false)
        if (savedBoolean11 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean12 = sharedPreferences.getBoolean("cfg", false)
        val buttonkri7 = intent.getBooleanExtra("cfgbt", false)
        if (savedBoolean12 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean13 = sharedPreferences.getBoolean("java", false)
        val buttonkri8 = intent.getBooleanExtra("javabt", false)
        if (savedBoolean13 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }

        val savedBoolean15 = sharedPreferences.getBoolean("kotlin", false)
        val buttonkri9 = intent.getBooleanExtra("kotlinbt", false)
        if (savedBoolean15 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean16 = sharedPreferences.getBoolean("gradle", false)
        val buttonkri10 = intent.getBooleanExtra("gradlebt", false)
        if (savedBoolean16 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean17 = sharedPreferences.getBoolean("ukratko2", false)
        val buttonkri11 = intent.getBooleanExtra("ukratko2bt", false)
        if (savedBoolean17 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean18 = sharedPreferences.getBoolean("napraviprojekat", false)
        val buttonkri12 = intent.getBooleanExtra("napraviprojekatbt", false)
        if (savedBoolean18 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean19 = sharedPreferences.getBoolean("napraviavd", false)
        val buttonkri13 = intent.getBooleanExtra("napraviavdbt", false)
        if (savedBoolean19 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }

        val savedBoolean20 = sharedPreferences.getBoolean("sadrzaj", false)
        val buttonkri14 = intent.getBooleanExtra("sadrzajbt", false)
        if (savedBoolean20 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean21 = sharedPreferences.getBoolean("intent", false)
        val buttonkri15 = intent.getBooleanExtra("intentbt", false)
        if (savedBoolean21 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean22 = sharedPreferences.getBoolean("ukratko3", false)
        val buttonkri16 = intent.getBooleanExtra("ukratko3bt", false)
        if (savedBoolean22 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean23 = sharedPreferences.getBoolean("priprema", false)
        val buttonkri17 = intent.getBooleanExtra("pripremabt", false)
        if (savedBoolean23 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }

        val savedBoolean24 = sharedPreferences.getBoolean("konfigurisanje", false)
        val buttonkri18 = intent.getBooleanExtra("konfigurisanjebt", false)
        if (savedBoolean24 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean25 = sharedPreferences.getBoolean("appzaobj", false)
        val buttonkri19 = intent.getBooleanExtra("appzaobjbt", false)
        if (savedBoolean25 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean26 = sharedPreferences.getBoolean("ukratko4", false)
        val buttonkri20 = intent.getBooleanExtra("ukratko4bt", false)
        if (savedBoolean26 == true) {
            progressBar5.progress = progr4 + 5
            progr4 = progr4 + 5
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean27 = sharedPreferences.getBoolean("ukratko5", false)
        val buttonkri21 = intent.getBooleanExtra("ukratko5bt", false)
        if (savedBoolean27 == true) {
            progressBar5.progress = progr4 + 10
            progr4 = progr4 + 10
            textView66.text = "$progr4%"

        } else {


        }
        val savedBoolean28 = sharedPreferences.getBoolean("tvoraclinuxa", false)
        val buttonkri22 = intent.getBooleanExtra("tvoraclinuxabt", false)
        if (savedBoolean28 == true) {
            progressBar4.progress = progr3 + 8
            progr3 = progr3 + 8
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean29 = sharedPreferences.getBoolean("istorijalinuxa", false)
        val buttonkri23= intent.getBooleanExtra("istorijalinuxabt", false)
        if (savedBoolean29 == true) {
            progressBar4.progress = progr3 + 8
            progr3 = progr3 + 8
            textView67.text = "$progr3%"
        } else {


        }

        val savedBoolean30 = sharedPreferences.getBoolean("linuxdanas", false)
        val buttonkri24 = intent.getBooleanExtra("linuxdanasbt", false)
        if (savedBoolean30== true) {
            progressBar4.progress = progr3 + 8
            progr3 = progr3 + 8
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean31 = sharedPreferences.getBoolean("pdf", false)
        val buttonkri25 = intent.getBooleanExtra("pdfbt", false)
        if (savedBoolean31 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean32 = sharedPreferences.getBoolean("prikazivacislika", false)
        val buttonkri26 = intent.getBooleanExtra("prikazivacislikabt", false)
        if (savedBoolean32 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean33 = sharedPreferences.getBoolean("gimp", false)
        val buttonkri27 = intent.getBooleanExtra("gimpbt", false)
        if (savedBoolean33 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }

        val savedBoolean34 = sharedPreferences.getBoolean("colorchooser", false)
        val buttonkri28 = intent.getBooleanExtra("colorchooserbt", false)
        if (savedBoolean34 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean35 = sharedPreferences.getBoolean("kreiranjefajlova", false)
        val buttonkri29= intent.getBooleanExtra("kreiranjefajlovabt", false)
        if (savedBoolean35 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean36 = sharedPreferences.getBoolean("navigacionekomande2", false)
        val buttonkri39 = intent.getBooleanExtra("navigacionekomandebt", false)
        if (savedBoolean36 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean37 = sharedPreferences.getBoolean("vieditor", false)
        val buttonkri31 = intent.getBooleanExtra("vieditorbt", false)
        if (savedBoolean37 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean38 = sharedPreferences.getBoolean("upravljanjefajlovima", false)
        val buttonkri32 = intent.getBooleanExtra("upravljanjefajlovimabt", false)
        if (savedBoolean38 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }

        val savedBoolean39 = sharedPreferences.getBoolean("najnovijikernel", false)
        val buttonkri33 = intent.getBooleanExtra("najnovijikernelbt", false)
        if (savedBoolean39 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean40 = sharedPreferences.getBoolean("prilagođavanjekernela", false)
        val buttonkri34 = intent.getBooleanExtra("prilagođavanjekernelabt", false)
        if (savedBoolean40 == true) {
            progressBar4.progress = progr3 + 7
            progr3 = progr3 + 7
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean41 = sharedPreferences.getBoolean("konfiguracijskimeni", false)
        val buttonkri35 = intent.getBooleanExtra("konfiguracijskimenibt", false)
        if (savedBoolean41 == true) {
            progressBar4.progress = progr3 + 5
            progr3 = progr3 + 5
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean42 = sharedPreferences.getBoolean("uređajizaskladištenja", false)
        val buttonkri36 = intent.getBooleanExtra("uređajizaskladištenjabt", false)
        if (savedBoolean42 == true) {
            progressBar4.progress = progr3 + 8
            progr3 = progr3 + 8
            textView67.text = "$progr3%"

        } else {


        }
        val savedBoolean43 = sharedPreferences.getBoolean("okoronavirusu", false)
        val buttonkri37 = intent.getBooleanExtra("okoronavirusubt", false)
        if (savedBoolean43 == true) {
            progressBar1.progress = progr + 34
            progr = progr + 34
            textView70.text = "$progr%"

        } else {


        }
        val savedBoolean44 = sharedPreferences.getBoolean("kakosezastititi", false)
        val buttonkri38 = intent.getBooleanExtra("kakosezastititibt", false)
        if (savedBoolean44 == true) {
            progressBar1.progress = progr + 33
            progr = progr + 33
            textView70.text = "$progr%"

        } else {


        }
        val savedBoolean45 = sharedPreferences.getBoolean("vakcine", false)
        val buttonkri40 = intent.getBooleanExtra("vakcinebt", false)
        if (savedBoolean45 == true) {
            progressBar1.progress = progr + 33
            progr = progr + 33
            textView70.text = "$progr%"

        } else {


        }
        val savedBoolean46 = sharedPreferences.getBoolean("http", false)
        val buttonkri41 = intent.getBooleanExtra("httpbt", false)
        if (savedBoolean46 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean47 = sharedPreferences.getBoolean("browser", false)
        val buttonkri42 = intent.getBooleanExtra("browserbt", false)
        if (savedBoolean47 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean48 = sharedPreferences.getBoolean("dns", false)
        val buttonkri43 = intent.getBooleanExtra("dnsbt", false)
        if (savedBoolean48 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean49 = sharedPreferences.getBoolean("domen", false)
        val buttonkri44 = intent.getBooleanExtra("domenbt", false)
        if (savedBoolean49 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean50 = sharedPreferences.getBoolean("hosting", false)
        val buttonkri45 = intent.getBooleanExtra("hostingbt", false)
        if (savedBoolean50 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean51 = sharedPreferences.getBoolean("html", false)
        val buttonkri46 = intent.getBooleanExtra("htmlbt", false)
        if (savedBoolean51 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean52 = sharedPreferences.getBoolean("css", false)
        val buttonkri47 = intent.getBooleanExtra("cssbt", false)
        if (savedBoolean52 == true) {
            progressBar2.progress = progr1 + 11
            progr1 = progr1 + 11
            textView69.text = "$progr1%"

        } else {


        }
        val savedBoolean53 = sharedPreferences.getBoolean("javascript", false)
        val buttonkri48 = intent.getBooleanExtra("javascriptbt", false)
        if (savedBoolean53 == true) {
            progressBar2.progress = progr1 + 12
            progr1 = progr1 + 12
            textView69.text = "$progr1%"

        } else {


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

                } else if (p0.equals("Linux") or p0.equals("Linux serveri") or p0.equals("linux serveri") or p0.equals(
                        "linux server"
                    ) or p0.equals("Linux server") or p0.equals("linux")
                ) {

                    val intent = Intent(this@SveMape, LinuxServeri::class.java)
                    startActivity(intent)

                } else if (p0.equals("O linuxu") or p0.equals("O Linuxu") or p0.equals("o linuxu") or p0.equals(
                        "o Linuxu"
                    )
                ) {

                    val intent = Intent(this@SveMape, Olinuxu::class.java)
                    startActivity(intent)

                } else if (p0.equals("Interfejs komandne linije") or p0.equals("interfejs komandne linije")) {

                    val intent = Intent(this@SveMape, InterfejsKomandneLinije::class.java)
                    startActivity(intent)

                } else if (p0.equals("Linuxovi grafički programi") or p0.equals("linuxovi grafički programi") or p0.equals(
                        "Linuxovi graficki programi"
                    ) or p0.equals("linuxovi graficki programi")
                ) {

                    val intent = Intent(this@SveMape, GrafickiProgrami::class.java)
                    startActivity(intent)

                } else if (p0.equals("Linuxov Kernel") or p0.equals("Linuxov kernel") or p0.equals("linuxov kernel")) {

                    val intent = Intent(this@SveMape, LinuxovKernel::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("Covid") or p0.equals("covid19") or p0.equals("Covid19")or p0.equals("Covid-19")or p0.equals("covid-19")or p0.equals("covid")) {

                    val intent = Intent(this@SveMape,Covid19::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("o covidu") or p0.equals("o koroni") or p0.equals("O Koroni")or p0.equals("O Covidu")or p0.equals("O covidu")or p0.equals("O koroni")) {

                    val intent = Intent(this@SveMape,OKoronaVirusu::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("Vakcine") or p0.equals("Vakcina") or p0.equals("vakcine")or p0.equals("vakcina")) {

                    val intent = Intent(this@SveMape,Vakcine::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("Internet") or p0.equals("internet")) {

                    val intent = Intent(this@SveMape,Internet2::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("HTML") or p0.equals("html")) {

                    val intent = Intent(this@SveMape,HTML::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("CSS") or p0.equals("css")) {

                    val intent = Intent(this@SveMape,CSS::class.java)
                    startActivity(intent)

                }
                else if (p0.equals("javascript") or p0.equals("JavaScript")) {

                    val intent = Intent(this@SveMape,JavaScript::class.java)
                    startActivity(intent)

                }
                else {
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
    override fun onBackPressed() {
       val intent=Intent(this,HomeActivitz::class.java)
        startActivity(intent)
    }
}
    














