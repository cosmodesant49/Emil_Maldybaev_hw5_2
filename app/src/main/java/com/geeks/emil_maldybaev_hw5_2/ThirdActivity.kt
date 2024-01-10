package com.geeks.emil_maldybaev_hw5_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list = App.appDatabase.getDao().getAll()
        list.forEach {
            binding.tvHistory.text = list.joinToString (prefix = "", separator = "")
        }
    }
}