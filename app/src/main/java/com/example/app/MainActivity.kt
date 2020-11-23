package com.example.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
   // private lateinit var mToggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.planets_spinner)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        val btn_scrore = findViewById<Button>(R.id.scrore)
        btn_scrore.setOnClickListener {
            val intent = Intent(this, scrore::class.java)
            startActivity(intent)

        }

        val btn_togel = findViewById<Button>(R.id.togel)
        btn_togel.setOnClickListener {
            val intent = Intent(this, togel::class.java)
            startActivity(intent)
        }

        val btn_side = findViewById<Button>(R.id.side)
        btn_side.setOnClickListener {
            val intent = Intent(this, SideActivity::class.java)
            startActivity(intent)
        }
        // memunculkan tombol burger menu
       // supportActionBar?.setHomeButtonEnabled(true)
      // supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // untuk toggle open dan close navigation
        // mToggle = ActionBarDrawerToggle(this, drawer_layout, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        // tambahkan mToggle ke drawer_layout sebagai pengendali open dan close drawer
       // drawer_layout.addDrawerListener(mToggle)
       // mToggle.syncState()
    }
   // override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
      //  return mToggle.onOptionsItemSelected(item)

    //}
}
