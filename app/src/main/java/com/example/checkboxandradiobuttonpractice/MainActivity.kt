package com.example.checkboxandradiobuttonpractice

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.checkboxandradiobuttonpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnOrder.setOnClickListener {
                val checkedRadioButtonId = rgMeat.checkedRadioButtonId
                val meat = findViewById<RadioButton>(checkedRadioButtonId)
                val cheese = cbCheese.isChecked
                val onions = cbOnions.isChecked
                val salad = cbSalad.isChecked
                val orderString = "You ordered a burger with:\n" +
                        "${meat.text}" +
                        (if (cheese) "\nCheese" else "") +
                        (if (onions) "\nOnions" else "") +
                        (if (salad) "\nSalad" else "")
                tvOrder.text = orderString
            }
        }
    }
}