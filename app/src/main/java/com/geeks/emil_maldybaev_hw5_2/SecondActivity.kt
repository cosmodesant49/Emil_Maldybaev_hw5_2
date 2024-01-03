package com.geeks.emil_maldybaev_hw5_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivitySecondBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    private val viewModel: LoveViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")


        binding.etFirstName.text = name
        binding.etSecondName.text = surname

        initClickers()

    }

    private fun initClickers() {
        with(binding) {
            btnShow.setOnClickListener {
                viewModel.getLoveLiveData(etFirstName.text.toString(), etSecondName.text.toString())
                    .observe(this@SecondActivity,
                        Observer {
                            tvSecondResult.text = it.toString()
                        })
                /*
                                RetrofitService().api.getLovePercentage(etFirstName.text.toString(),etSecondName.text.toString())
                                    .enqueue(object :Callback<LoveModel>{
                                        override fun onResponse(
                                            call: Call<LoveModel>,
                                            response: Response<LoveModel>
                                        ) {
                                            tvSecondResult.text = response.body().toString()
                                        }

                                        override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                                            tvSecondResult.text = t.message
                                        }
                                    })*/

            }
        }
        //binding.btnGet.setOnClickListener { sendData()}
    }


}