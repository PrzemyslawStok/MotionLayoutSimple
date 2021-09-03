package com.motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        NullSaveClass.function0()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openActivityButton.setOnClickListener {
            //Toast.makeText(this, "Kliknięto klaiwsz", Toast.LENGTH_SHORT).show()
            val intent0 = Intent(this, Activity1::class.java)
            startActivity(intent0)
        }

        binding.openActivity2Button.setOnClickListener {
            val intent0 = Intent(this, GuideLineActivity::class.java)
            startActivity(intent0)
        }

        binding.newButton.setOnClickListener{

        }
        //binding.textViewSimple.text = "234234234234"

        /*val binding = CatLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

    }
}