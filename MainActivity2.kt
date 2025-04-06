package com.example.meet_249632_pract4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val btn2 = findViewById<Button>(R.id.btn2)

        val username = intent.getStringExtra("username")
        val userphone = intent.getStringExtra("userphone")
        val useremail = intent.getStringExtra("useremail")


        tv1.text = "Hello, $username"
        tv2.text = "Your name : $userphone"
        tv3.text = "Your email : $useremail"

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
