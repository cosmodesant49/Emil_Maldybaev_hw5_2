package com.geeks.emil_maldybaev_hw5_2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.geeks.emil_maldybaev_hw5_2.data.local.Pref
import com.geeks.emil_maldybaev_hw5_2.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var navController: NavController? = null

    @Inject
    lateinit var pref: Pref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        if (!pref.isShow()) {
            Log.e("ololo", "navigated to onBoarding")
            navController?.navigate(R.id.onBoardingFragment3)
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

    }
}