package com.geeks.emil_maldybaev_hw5_2.model

import com.google.gson.annotations.SerializedName

data class LoveModel (
    @SerializedName("firstName")
    val fname:String,
    @SerializedName("secondName")
    val sname:String,
    val percentage:String,
    val result:String,

    )
/*    {
        "fname": "John",
        "sname": "Alice",
        "percentage": "46",
        "result": "Can choose someone better."
    }*/
