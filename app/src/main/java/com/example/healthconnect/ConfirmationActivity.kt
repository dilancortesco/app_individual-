package com.example.healthconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val name = intent.getStringExtra("NAME")
        val age = intent.getStringExtra("AGE")
        val email = intent.getStringExtra("EMAIL")
        val specialty = intent.getStringExtra("SPECIALTY")

        val confirmationTextView = findViewById<TextView>(R.id.confirmationTextView)
        "Nombre: $name\nEdad: $age\nCorreo: $email\nEspecialidad: $specialty".also { confirmationTextView.text = it }
    }
}
