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

        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<TextView>(R.id.textView1).text =
                findViewById<EditText>(R.id.input1).text
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView2).text =
                findViewById<TextView>(R.id.textView2).text.toString() +
                        findViewById<EditText>(R.id.input1).text.toString()
        }
    }
}