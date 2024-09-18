package com.example.signlearn

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        // Delay of 5 seconds (5000 milliseconds) before redirecting to Mainpg1
        Handler(Looper.getMainLooper()).postDelayed({
            // Redirect to Mainpg1 activity
            val intent = Intent(this, ::class.java)
            startActivity(intent)
            finish() // Close current activity so it doesn't remain in the back stack
        }, 2000)
    }
}
