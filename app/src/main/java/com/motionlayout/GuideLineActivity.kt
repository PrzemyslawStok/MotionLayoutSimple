package com.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.motionlayout.databinding.ActivityGuideLineBinding

class GuideLineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_guide_line)

        val binding = ActivityGuideLineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number0 = binding.editTextNumber0.text.toString().toDoubleOrNull()


    }
}