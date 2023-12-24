package com.geeks.emil_maldybaev_hw5_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sendData()
        //initClickers()
    }

/*    private fun initClickers() {
        with(binding){
            btnGet.setOnClickListener{

                RetrofitService().api.getLovePercentage(etFirstName.text.toString(),etSecondName.text.toString())
                    .enqueue(object :Callback<LoveModel>{
                        override fun onResponse(
                            call: Call<LoveModel>,
                            response: Response<LoveModel>
                        ) {
                            tvResult.text = response.body().toString()
                        }

                        override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                            tvResult.text = t.message
                        }
                    })

            }
        }
        //binding.btnGet.setOnClickListener { sendData()}
        }*/

    private fun sendData() {
        binding.btnGet.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", binding.etFirstName.text.toString())
            intent.putExtra("surname", binding.etSecondName.text.toString())
            startActivity(intent)
        }
        }
}