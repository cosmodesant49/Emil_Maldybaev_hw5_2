package com.geeks.emil_maldybaev_hw5_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}