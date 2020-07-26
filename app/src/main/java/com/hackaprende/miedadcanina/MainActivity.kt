package com.hackaprende.miedadcanina

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hackaprende.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            Log.d("MainActivity", "Age string is: $ageString")
            if (ageString.isEmpty()) {
                Toast.makeText(this, getString(R.string.must_insert_age),
                    Toast.LENGTH_SHORT).show()
            } else {
                val ageInt = ageString.toInt()
                val dogAge = ageInt * 7
                binding.resultText.text = getString(R.string.result_format, dogAge)
            }
        }
    }
}