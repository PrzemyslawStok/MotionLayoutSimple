package com.motionlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.motionlayout.databinding.ActivityMainBinding
import com.motionlayout.databinding.CatLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openActivity.setOnClickListener {
            Toast.makeText(this, "Kliknięto klaiwsz", Toast.LENGTH_SHORT).show()
            val intent0 = Intent(this, Activity1::class.java)
            startActivity(intent0)
        }
        //binding.textViewSimple.text = "234234234234"

        /*val binding = CatLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

    }
}