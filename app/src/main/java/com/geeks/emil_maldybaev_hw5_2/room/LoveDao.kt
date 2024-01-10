package com.geeks.emil_maldybaev_hw5_2.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.geeks.emil_maldybaev_hw5_2.model.LoveModel
@Dao
interface LoveDao {

    @Query("SELECT * FROM `love-table` ORDER BY firstName ASC")
    fun getAll(): List<LoveModel>

    @Insert
    fun insert(model: LoveModel)
}
