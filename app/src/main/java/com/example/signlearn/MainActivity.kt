package com.example.signlearn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var teacherButton: Button
    private lateinit var studentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Correct references to button IDs from the layout file
        teacherButton = findViewById(R.id.button2)
        studentButton = findViewById(R.id.button)

        // Set click listeners for the buttons
        teacherButton.setOnClickListener {
            // Redirect to teacher's dashboard
            val intent = Intent(this, TeacherDashboardActivity::class.java)
            startActivity(intent)
        }

        studentButton.setOnClickListener {
            // Redirect to student's dashboard
            val intent = Intent(this, StudentDashboardActivity::class.java)
            startActivity(intent)
        }
    }
}
