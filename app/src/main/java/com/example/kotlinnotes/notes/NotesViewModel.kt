package com.example.kotlinnotes.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinnotes.models.Note

class NotesViewModel : ViewModel() {


    private val model: NoteModel = NoteModel()
    private val _noteListLiveData: MutableLiveData<MutableList<Note>> = MutableLiveData()
    val noteListLiveData: LiveData<MutableList<Note>> = _noteListLiveData


    init {
        _noteListLiveData.postValue(model.getFakeData())
    }

}