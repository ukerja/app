package com.example.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

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
    }
}
