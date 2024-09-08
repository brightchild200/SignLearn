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

        teacherButton = findViewById(R.id.teacherButton)
        studentButton = findViewById(R.id.studentButton)

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
