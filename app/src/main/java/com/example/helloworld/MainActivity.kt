package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var minus = findViewById<Button>(R.id.decrement_button)
        var plus = findViewById<Button>(R.id.increment_button)
        var text = findViewById<TextView>(R.id.counterValue)

        text.text = "" + count


        minus.setOnClickListener{
            counterValue.text = "" + --count
        }

        plus.setOnClickListener{
            counterValue.text = "" + ++count
        }
    }
}