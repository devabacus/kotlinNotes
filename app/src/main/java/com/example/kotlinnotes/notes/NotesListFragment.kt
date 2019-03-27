package com.example.kotlinnotes.notes


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kotlinnotes.R

class NotesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes_list, container, false)
    }
    companion object { fun newInstance() = NotesListFragment() }
}
