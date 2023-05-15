package com.example.lesson4async

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.channels.trySendBlocking
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch




class MyViewModel(savedStateHandle: SavedStateHandle):ViewModel() {

   // val data= flowOf(4)
    val liveData = savedStateHandle.getLiveData<String>("KEY", "")


    init {


        liveData.value = ""


        val s = viewModelScope.launch {


        }

    }


    val callback = callbackFlow<String> {


        trySendBlocking("")


        awaitClose()
    }.flowOn(Dispatchers.IO)






}