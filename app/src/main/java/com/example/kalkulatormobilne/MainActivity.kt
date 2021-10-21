package com.example.kalkulatormobilne

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var wynik = 0;
        var LiczbaPierwsza = 0
        var LiczbaDruga = 0
        var napis = wynik.toString()
        var dzialanie = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<TextView>(R.id.wyniktext).text = ""

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "1"
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "2"
        }
        findViewById<Button>(R.id.btn3).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "3"
        }
        findViewById<Button>(R.id.btn4).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "4"
        }
        findViewById<Button>(R.id.btn5).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "5"
        }
        findViewById<Button>(R.id.btn6).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "6"
        }
        findViewById<Button>(R.id.btn7).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "7"
        }
        findViewById<Button>(R.id.btn8).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "8"
        }
        findViewById<Button>(R.id.btn9).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "9"
        }
        findViewById<Button>(R.id.btn10).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text =
                findViewById<TextView>(R.id.wyniktext).text.toString() + "0"
        }
        findViewById<Button>(R.id.btn11).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.wyniktext).text.toString().toInt()
            findViewById<TextView>(R.id.wyniktext).text = ""
            dzialanie = 1
        }
        findViewById<Button>(R.id.btn12).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.wyniktext).text.toString().toInt()
            findViewById<TextView>(R.id.wyniktext).text = ""
            dzialanie = 2
        }
        findViewById<Button>(R.id.btn13).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.wyniktext).text.toString().toInt()
            findViewById<TextView>(R.id.wyniktext).text = ""
            dzialanie = 3
        }
        findViewById<Button>(R.id.btn14).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.wyniktext).text.toString().toInt()
            findViewById<TextView>(R.id.wyniktext).text = ""
            dzialanie = 4
        }
        findViewById<Button>(R.id.btn15).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.wyniktext).text.toString().toInt()
            if (dzialanie == 1) {
                wynik = LiczbaPierwsza + LiczbaDruga
            } else if (dzialanie == 2) {
                wynik = LiczbaPierwsza - LiczbaDruga
            } else if (dzialanie == 3) {
                wynik = LiczbaPierwsza * LiczbaDruga
            } else if (dzialanie == 4) {
                wynik = LiczbaPierwsza / LiczbaDruga
            }
            findViewById<TextView>(R.id.wyniktext).text = wynik.toString()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}