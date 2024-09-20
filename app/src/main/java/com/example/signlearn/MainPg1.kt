package com.example.signlearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainPg1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpg1)

        // Find views by ID
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val textView: TextView = findViewById(R.id.textView)

        // Redirect to RecordedLecturesActivity when button3 is clicked
        button3.setOnClickListener {
            val intent = Intent(this, RecordedLec::class.java)
            startActivity(intent)
        }

        // Redirect to OkActivity when button4 is clicked
        button4.setOnClickListener {
            val intent = Intent(this, Learn::class.java)
            startActivity(intent)
        }
    }
}
