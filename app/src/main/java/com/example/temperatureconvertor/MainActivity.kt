package com.example.temperatureconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  editText = findViewById<EditText>(R.id.tempEt)
        val  resultText =  findViewById<TextView>(R.id.ansTv)

        val button1C = findViewById<Button>(R.id.celciusBtn)
        val button2F = findViewById<Button>(R.id.frehnBtn)

        var Tc = 0.0
        button1C?.setOnClickListener()
         {
             val value = (editText.text.toString()).toDouble()

           Tc = (value -32)/1.8
           resultText.text = "°C = $Tc"
        }

        var Tf = 0.0
        button2F.setOnClickListener()
        {
            val value = (editText.text.toString()).toDouble()

            Tf = (1.8*value)+32
            resultText.text = "°F = $Tf"
        }

    }

}