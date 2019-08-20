package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //ngasih initial value which is null tapi nanti kalo = null hrs diinit lg di dlm oncreate trs pake method nullcheck dulu
    //jadi null diapus trs diganti jadi pake lateinit promises the compiler that the variable will be initialized before calling any operations on it
    //promising that we will not leave it as null
//    var diceImage: ImageView? = null
    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = this.findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.imgDice)
    }

    private fun rollDice() {
        //Random().nextInt(6) => ini bakal ngasih nomor random antara 0 - 5, supaya randomnya dari 1 - 6 jadi (6)+1
        val randomInt = Random.nextInt(6) +1

//        bikin variabel drawableResource yg isinya when expression ketika angka yg keluar 1 dia ngeluarin gambar dice_1 dst
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //minimalisasi penggunaan findviewbyid krn ini makan memori, bakal ngelag kalo di app complex dipake trll banyak
        //val diceImage: ImageView = findViewById(R.id.imgDice)
        diceImage.setImageResource(drawableResource)
    }
}
