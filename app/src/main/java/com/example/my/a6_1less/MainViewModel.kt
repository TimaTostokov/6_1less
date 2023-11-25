package com.example.my.a6_1less

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0

    private var _counterLV = MutableLiveData<Int>()

    val counterLV = _counterLV as LiveData<Int>

    fun dec() {
        counter -= 1
        _counterLV.value = counter
    }

    fun inc() {
        counter += 1
        _counterLV.value = counter
    }

}