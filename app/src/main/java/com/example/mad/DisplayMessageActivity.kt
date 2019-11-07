package com.example.mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("adj1X")

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView6).apply {
            text = message
        }

        val message2 = intent.getStringExtra("adj2X")
        val textView2 = findViewById<TextView>(R.id.textView14).apply {
            text = message2
        }

        val message3 = intent.getStringExtra("adj3X")
        val textView3 = findViewById<TextView>(R.id.textView31).apply {
            text = message3
        }

        val message4 = intent.getStringExtra("advX")
        val textView4 = findViewById<TextView>(R.id.textView33).apply {
            text = message4
        }

        val message5 = intent.getStringExtra("Noun1X")
        val textView5 = findViewById<TextView>(R.id.textView9).apply {
            text = message5
        }

        val message6 = intent.getStringExtra("Noun2X")
        val textView6 = findViewById<TextView>(R.id.textView12).apply {
            text = message6
        }

        val message7 = intent.getStringExtra("Noun3X")
        val textView7 = findViewById<TextView>(R.id.textView17).apply {
            text = message7
        }

        val message8 = intent.getStringExtra("Noun4X")
        val textView8 = findViewById<TextView>(R.id.textView21).apply {
            text = message8
        }

        val message9 = intent.getStringExtra("Noun5X")
        val textView9 = findViewById<TextView>(R.id.textView27).apply {
            text = message9
        }

        val message10 = intent.getStringExtra("Noun6X")
        val textView10 = findViewById<TextView>(R.id.textView37).apply {
            text = message10
        }

        val message11 = intent.getStringExtra("pluralNounX")
        val textView11 = findViewById<TextView>(R.id.textView39).apply {
            text = message11
        }
    }

}
