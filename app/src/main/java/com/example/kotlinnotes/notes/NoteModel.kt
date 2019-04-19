package com.example.kotlinnotes.notes

import com.example.kotlinnotes.models.Note

class NoteModel {

    fun getFakeData(): MutableList<Note> =
        mutableListOf(
            Note("note1"),
            Note("note2"),
            Note("note3")
        )
}