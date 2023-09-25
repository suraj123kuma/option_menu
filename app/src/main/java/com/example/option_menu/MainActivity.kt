package com.example.option_menu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        var RelativeLayout = findViewById<RelativeLayout>(R.id.RelativeLayout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_option,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Notifacion -> {
                Toast.makeText(this, "Notifacion", Toast.LENGTH_SHORT).show()

            }

            R.id.setting -> {
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            }

            R.id.logout -> {
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}


