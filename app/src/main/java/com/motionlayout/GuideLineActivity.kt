package com.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.motionlayout.databinding.ActivityGuideLineBinding

class GuideLineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_guide_line)

        val binding = ActivityGuideLineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            val number0 = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()

            if (number0 != null && number1 != null) {
                val result = number0 + number1
                Snackbar.make(binding.root, "${result}", Snackbar.LENGTH_SHORT).show()
            }

        }




    }
}