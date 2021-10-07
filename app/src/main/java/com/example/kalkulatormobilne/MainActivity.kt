package com.example.kalkulatormobilne

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var wynik = 0;
        var napis = wynik.toString()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        findViewById<Button>(R.id.btn1).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "1"
        }
        findViewById<Button>(R.id.btn2).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "2"
        }
        findViewById<Button>(R.id.btn3).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "3"
        }
        findViewById<Button>(R.id.btn4).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "4"
        }
        findViewById<Button>(R.id.btn5).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "5"
        }
        findViewById<Button>(R.id.btn6).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "6"
        }
        findViewById<Button>(R.id.btn7).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "7"
        }
        findViewById<Button>(R.id.btn8).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "8"
        }
        findViewById<Button>(R.id.btn9).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "9"
        }
        findViewById<Button>(R.id.btn10).setOnClickListener{
            findViewById<Button>(R.id.wyniktext).text = "0"
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