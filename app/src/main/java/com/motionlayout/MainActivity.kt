package com.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //textViewSimple.text = "2342323234"
        //mainLayout.setBackgroundColor(Color.CYAN)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewSimple.text = "234234234234"

    }
}