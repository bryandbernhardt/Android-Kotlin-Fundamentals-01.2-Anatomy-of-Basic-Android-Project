package com.bryandbernhardt.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val upButton = findViewById<Button>(R.id.up_button)
        upButton.setOnClickListener { countUp() }

        val resetButton = findViewById<Button>(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
//        Toast.makeText(
//            this, "button clicked",
//            Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultNumber: Int? = resultText.text.toString().toIntOrNull()

        if(resultNumber === null) {
            resultText.text = "1"
        } else {
            if (resultNumber < 6) {
                resultText.text = (resultNumber + 1).toString()
            }
        }
    }

    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "HelloWorld!"
    }
}