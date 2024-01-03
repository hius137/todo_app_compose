package com.hieuvm.todoapp.ui.note_page

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class NoteViewModel : ViewModel(){
    init {
        loadData()
    }
    private fun loadData(){

    }
}

class NoteViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NoteViewModel::class.java)) {
            return NoteViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}