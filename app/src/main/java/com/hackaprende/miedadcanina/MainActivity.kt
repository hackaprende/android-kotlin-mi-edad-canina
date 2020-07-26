package com.hackaprende.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText = findViewById<TextView>(R.id.result_text)
        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val ageEdit = findViewById<EditText>(R.id.age_edit)

        calculateButton.setOnClickListener {
            val ageString = ageEdit.text.toString()
            Log.d("MainActivity", "Age string is: $ageString")
            if (ageString.isEmpty()) {
                Toast.makeText(this, getString(R.string.must_insert_age),
                    Toast.LENGTH_SHORT).show()
            } else {
                val ageInt = ageString.toInt()
                val dogAge = ageInt * 7
                resultText.text = getString(R.string.result_format, dogAge)
            }
        }
    }
}