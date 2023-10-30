    package com.example.assignment

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton


    class MainActivity : AppCompatActivity() {
        private val randomTextArray = arrayListOf(
            "Hamburger", "Pizza",
            "Mexican", "American", "Chinese"
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set an initial text
        setRandomText()

        // Add a click listener to the button
        val changeTextButton: AppCompatButton = findViewById(R.id.changeTextButton)
        val add: AppCompatButton = findViewById(R.id.add)
        val textView: TextView = findViewById(R.id.textView)
        val addText: EditText = findViewById(R.id.editTextText)
        changeTextButton.setOnClickListener {
            setRandomText()
        }

        add.setOnClickListener {
            addItemToList(addText.text.toString())
        }
    }

        private fun setRandomText() {
            val random = java.util.Random()
            val randomIndex = random.nextInt(randomTextArray.size)
            val randomText = randomTextArray[randomIndex]
            val textView: TextView = findViewById(R.id.textView)
            textView.text = randomText
        }

        private fun addItemToList(item: String) {
            randomTextArray.add(item)
            val textView: TextView = findViewById(R.id.textView)
            textView.text = item
        }
    }