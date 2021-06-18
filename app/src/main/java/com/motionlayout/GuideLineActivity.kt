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
            val number0:Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1:Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            number0?.let{
                val no = it
                number1?.let{
                    Snackbar.make(binding.root, "${no+it}", Snackbar.LENGTH_SHORT).show()
                }
            }

            val x: Double = number0?:0.0
            val y: Double = number1?:0.0

            if (number0 != null && number1 != null) {
                val result = number0 + number1
                Snackbar.make(binding.root, "${result}", Snackbar.LENGTH_SHORT).show()
            }

        }




    }
}