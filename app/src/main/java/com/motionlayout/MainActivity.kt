package com.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.motionlayout.databinding.ActivityMainBinding
import com.motionlayout.databinding.CatLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.textViewSimple.text = "234234234234"

        /*val binding = CatLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

    }
}