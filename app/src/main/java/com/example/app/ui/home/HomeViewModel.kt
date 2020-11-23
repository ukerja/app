package com.example.app.ui.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.support.v7.widget.RecyclerView
import com.example.app.Datasource
import com.example.app.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SCORE"
    }

    val text: LiveData<String> = _text

}

