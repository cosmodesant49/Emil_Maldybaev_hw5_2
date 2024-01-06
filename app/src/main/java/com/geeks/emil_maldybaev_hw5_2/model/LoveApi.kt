package com.geeks.emil_maldybaev_hw5_2.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage\n")
    fun getLovePercentage(
        @Query("fname")firstName:String,
        @Query("sname")secondName:String,
        @Header("X-RapidAPI-Key") key:String = "1e446edff1msh30d9821744f7cd4p186933jsn1767c3a3a3e4",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
    ) : Call<LoveModel>
}