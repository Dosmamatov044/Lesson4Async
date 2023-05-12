package com.example.lesson4async

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch




class MyViewModel(savedStateHandle: SavedStateHandle):ViewModel() {


    val liveData=savedStateHandle.getLiveData<String>("KEY","")







    init {


liveData.value=""




      val s=  viewModelScope.launch {




        }

    }

}