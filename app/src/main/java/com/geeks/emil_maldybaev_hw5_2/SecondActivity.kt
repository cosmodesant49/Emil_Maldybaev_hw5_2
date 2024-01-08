package com.geeks.emil_maldybaev_hw5_2

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivitySecondBinding
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    private val viewModel: LoveViewModel by viewModels()

    @Inject
    lateinit var utils: Utils

    @Inject
    lateinit var hero: Hero

    @Inject
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name").toString()
        val surname = intent.getStringExtra("surname").toString()

/*
        binding.etFirstName.text = name
        binding.etSecondName.text = surname*/


            initClickers(name,surname)


    }

    private fun initClickers(name:String,sname:String) {
        with(binding) {
            btnShow.setOnClickListener {
                //sharedPreferences.edit().putBoolean("as",true).apply()
                utils.showToast(this@SecondActivity, hero.name + "${hero.damage}")
                viewModel.getLoveLiveData(name,sname)
                    .observe(this@SecondActivity,
                        Observer {
                            tvSecondResult.text = it.toString()
                        })

                //-------------------------------
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