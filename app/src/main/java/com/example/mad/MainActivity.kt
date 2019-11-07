package com.example.mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

val adj1X = "com"
val adj2X = "com"
val adj3X = "com"
val advX = "com"
val Noun1X = "com"
val Noun2X = "com"
val Noun3X = "com"
val Noun4X = "com"
val Noun5X = "com"
val Noun6X = "com"
val pluralNounX = "com"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText1 = findViewById<EditText>(R.id.adj1)
        val adj1XF = editText1.text.toString()

        val editText2 = findViewById<EditText>(R.id.adj2)
        val adj2XF = editText2.text.toString()

        val editText3 = findViewById<EditText>(R.id.adj3)
        val adj3XF = editText3.text.toString()

        val editText4 = findViewById<EditText>(R.id.adverb)
        val advXF = editText4.text.toString()

        val editText5 = findViewById<EditText>(R.id.noun1)
        val noun1XF = editText5.text.toString()

        val editText6 = findViewById<EditText>(R.id.noun2)
        val noun2XF = editText6.text.toString()

        val editText7 = findViewById<EditText>(R.id.noun3)
        val noun3XF = editText7.text.toString()

        val editText8 = findViewById<EditText>(R.id.noun4)
        val noun4XF = editText8.text.toString()

        val editText9 = findViewById<EditText>(R.id.noun5)
        val noun5XF = editText9.text.toString()

        val editText10 = findViewById<EditText>(R.id.noun6)
        val noun6XF = editText10.text.toString()

        val editText11 = findViewById<EditText>(R.id.plural_noun)
        val pluralNounXF = editText11.text.toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra("adj1X", adj1XF)
            putExtra("adj2X", adj2XF)
            putExtra("adj3X", adj3XF)
            putExtra("advX", advXF)
            putExtra("Noun1X", noun1XF)
            putExtra("Noun2X", noun2XF)
            putExtra("Noun3X", noun3XF)
            putExtra("Noun4X", noun4XF)
            putExtra("Noun5X", noun5XF)
            putExtra("Noun6X", noun6XF)
            putExtra("pluralNounX", pluralNounXF)
        }
        startActivity(intent)
    }
}

