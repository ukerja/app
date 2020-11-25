package com.example.app.ui.slideshow

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class WithdrawViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "WITHDRAW"
    }
    val text: LiveData<String> = _text
}