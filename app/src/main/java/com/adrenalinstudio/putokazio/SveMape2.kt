package com.adrenalinstudio.putokazio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sve_mape2.*

class SveMape2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sve_mape2)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {

                Toast.makeText(this@SveMape2, p0, Toast.LENGTH_SHORT).show()
                //Performs search when user hit the search button on the keyboard
               if (p0.equals("frontend")) {
                    val intent= Intent(this@SveMape2,KakoRadiInternet::class.java)
                   startActivity(intent)

                }
//                else {
//                    Toast.makeText(this@MainActivity, "No match found", Toast.LENGTH_SHORT).show()
//                }
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

