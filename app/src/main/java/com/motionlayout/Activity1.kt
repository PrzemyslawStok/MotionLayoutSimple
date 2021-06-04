package com.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.motionlayout.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_1)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        NullSaveClass.function0()
    }
}