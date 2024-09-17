package com.example.signlearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainPg1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpg1)  // Ensure this is the correct XML layout file

        // Find views by ID
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val textView: TextView = findViewById(R.id.textView)

        // Set up listeners or logic for your buttons
        button3.setOnClickListener {
            Toast.makeText(this, "Redirecting to recorded Lectures", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
        }
    }
}
