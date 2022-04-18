package com.dnu.android.lr2android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {

    val liveData = MutableLiveData<Note>()

    fun getText(){
        liveData.value = note
    }

    companion object{
        private val note = Note("Default title", "Default subtitle")
    }
}