package com.motionlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.motionlayout.databinding.ActivityGuideLineBinding
import java.lang.ArithmeticException

class GuideLineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_guide_line)

        val binding = ActivityGuideLineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            val number0: Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1: Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            /*number0?.let{
                val no = it
                number1?.let{
                    Snackbar.make(binding.root, "${no+it}", Snackbar.LENGTH_SHORT).show()
                }
            }*/

            val x: Double = number0 ?: 0.0
            val y: Double = number1 ?: 0.0

            Snackbar.make(binding.root, "${x + y}", Snackbar.LENGTH_SHORT).show()

            /*
            if (number0 != null && number1 != null) {
                val result = number0 + number1
                Snackbar.make(binding.root, "${result}", Snackbar.LENGTH_SHORT).show()
            }*/

            /*binding.editTextNumber1.setSelection(
                0,binding.editTextNumber1.text.toString().length
            )*/

        }

        binding.buttonMinus.setOnClickListener {
            val number0: Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1: Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            val x: Double = number0 ?: 0.0
            val y: Double = number1 ?: 0.0

            Snackbar.make(binding.root, "${x - y}", Snackbar.LENGTH_SHORT).show()
        }

        binding.buttonMul.setOnClickListener {
            val number0: Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1: Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            val x: Double = number0 ?: 0.0
            val y: Double = number1 ?: 0.0

            Snackbar.make(binding.root, "${x * y}", Snackbar.LENGTH_SHORT).show()
        }

        binding.buttonPow.setOnClickListener {
            val number0: Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1: Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            val x: Double = number0 ?: 0.0
            val y: Double = number1 ?: 0.0

            Snackbar.make(binding.root, "${Math.pow(x,y)}", Snackbar.LENGTH_SHORT).show()
        }

        binding.buttonDiv.setOnClickListener {
            val number0: Double? = binding.editTextNumber0.text.toString().toDoubleOrNull()
            val number1: Double? = binding.editTextNumber1.text.toString().toDoubleOrNull()

            val x: Double = number0 ?: 0.0
            val y: Double = number1 ?: 0.0

            Snackbar.make(binding.root, "${x/y}", Snackbar.LENGTH_SHORT).show()
        }


        binding.editTextNumber0.onFocusChangeListener =
            View.OnFocusChangeListener { view: View, focus: Boolean ->
                Snackbar.make(binding.root, "Chyba działa", Snackbar.LENGTH_SHORT).show()

                if(focus) {
                    binding.editTextNumber0.setText("")
                }

            }

        binding.buttonFunction.setOnClickListener{
            val x = 10
            val y = 0

            try {
                Snackbar.make(binding.root, "${x / y}", Snackbar.LENGTH_SHORT).show()
            }catch(e: ArithmeticException){
                e.message?.let { it1 ->
                    Snackbar.make(binding.root,
                        it1, Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}