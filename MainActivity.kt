package com.example.meet_249632_pract4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val name  = findViewById<EditText>(R.id.name)
        val phone  = findViewById<EditText>(R.id.phone)
        val email  = findViewById<EditText>(R.id.email)
        val button  = findViewById<Button>(R.id.btn1)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val username = name.text.toString()
            val userphone = phone.text.toString()
            val useremail = email.text.toString()
            intent.putExtra("username", username)
            intent.putExtra("userphone", userphone)
            intent.putExtra("useremail", useremail)
            startActivity(intent)
        }
    }
}
