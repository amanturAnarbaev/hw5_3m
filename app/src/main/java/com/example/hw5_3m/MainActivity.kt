package com.example.hw5_3m

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.hw5_3m.R.color.black

// extend it is :
class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val activity = findViewById<ConstraintLayout>(R.id.mainActivity)
        var number: Int = 0
        val text = findViewById<TextView>(R.id.text)

        button.setOnClickListener {
            if ( number <10) {
                number += 1
                text.text = number.toString()

                button.text = "+1"
                activity.setBackgroundResource(R.color.black)
            } else if (number ==10) {
                activity.setBackgroundResource(R.color.white)
                button.text = "-1"
                number -= 1
                text.setTextColor(R.color.black)
                text.text = number.toString()


            }
        }
    }


}



