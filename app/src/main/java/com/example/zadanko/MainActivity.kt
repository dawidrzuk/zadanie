package com.example.zadanko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1 = 0
        var liczba2 = 0
        var wynik = 0

        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text =
                findViewById<EditText>(R.id.input1).text
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView2).text =
                findViewById<TextView>(R.id.textView2).text.toString() +
                        findViewById<EditText>(R.id.input1).text.toString()
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            liczba1 = findViewById<EditText>(R.id.input2).text.toString().toInt()
            liczba2 = findViewById<EditText>(R.id.input3).text.toString().toInt()
            wynik = liczba1 + liczba2

            findViewById<TextView>(R.id.textView3).text =
                liczba1.toString() + " + " + liczba2.toString() + " = " +wynik.toString()
        }
    }
}