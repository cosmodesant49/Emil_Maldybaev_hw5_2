package com.geeks.emil_maldybaev_hw5_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.geeks.emil_maldybaev_hw5_2.model.LoveModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository) :ViewModel() {
    fun getLoveLiveData(firstName:String,secondName:String):LiveData<LoveModel> {
        return repository.getData(firstName,secondName)
    }
}