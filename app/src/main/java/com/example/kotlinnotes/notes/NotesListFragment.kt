package com.example.kotlinnotes.notes


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.kotlinnotes.R
import com.example.kotlinnotes.models.Note
import com.example.kotlinnotes.models.Task
import kotlinx.android.synthetic.main.fragment_notes_list.*

class NotesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes_list, container, false)
    }
    companion object { fun newInstance() = NotesListFragment() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val set = arrayOf<String>("stas","ivan","oleg","blabla","blablaagain")
        notes_rec_view.layoutManager = LinearLayoutManager(context)
        val adapter = NotesAdapter(set)
        notes_rec_view.adapter = adapter
    }
}
