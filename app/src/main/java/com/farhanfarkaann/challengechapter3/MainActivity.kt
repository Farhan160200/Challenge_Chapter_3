package com.farhanfarkaann.challengechapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanfarkaann.challengechapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }
}