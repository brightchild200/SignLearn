package com.example.signlearn

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setting the layout resource to welcome.xml
        setContentView(R.layout.welcome)

        // Delay for 3 seconds before redirecting to the dashboard
        Handler(Looper.getMainLooper()).postDelayed({
            // Intent to navigate to the dashboard activity
            val intent = Intent(this@MainActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity so the user cannot return to it
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
