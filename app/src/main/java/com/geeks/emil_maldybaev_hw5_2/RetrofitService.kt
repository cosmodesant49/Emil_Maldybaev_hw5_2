package com.geeks.emil_maldybaev_hw5_2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitService {
//https://love-calculator.p.rapidapi.com/getPercentage?sname=Alice&fname=John
    val retrofit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com")
    .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(LoveApi::class.java)
}