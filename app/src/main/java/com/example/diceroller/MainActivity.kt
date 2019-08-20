package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            rollDice()

        }

    }

    private fun rollDice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val resultText: TextView = findViewById(R.id.txtResult)
        resultText.text = "Dice rolled!"
    }
}
