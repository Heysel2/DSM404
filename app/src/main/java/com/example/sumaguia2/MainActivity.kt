package com.example.sumaguia2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.txtNumero1)
        val numero2 = findViewById<EditText>(R.id.txtNumero2)
        val resultado  = findViewById<TextView>(R.id.txtResultado)
        val sumar  = findViewById<Button>(R.id.btnSumar)

        sumar.setOnClickListener{
            resultado.setText(
                "La suma es: " + (numero1.text.toString().toFloat() + numero2.text.toString().toFloat())
            )
        }


    }
}