package com.geeks.emil_maldybaev_hw5_2.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geeks.emil_maldybaev_hw5_2.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getDao(): LoveDao
}