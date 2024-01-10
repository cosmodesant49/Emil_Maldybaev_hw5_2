package com.geeks.emil_maldybaev_hw5_2.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "love-table")
data class LoveModel (
    @SerializedName("fname")
    val firstName:String,
    @SerializedName("sname")
    val secondName:String,
    val percentage:String,
    val result:String,
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0

    ){
    override fun toString(): String {
        return "$firstName\n$secondName\n$percentage\n$result\n\n"
    }
}
/*    {
        "fname": "John",
        "sname": "Alice",
        "percentage": "46",
        "result": "Can choose someone better."
    }*/
