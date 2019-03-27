package com.example.kotlinnotes.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import com.example.kotlinnotes.foundations.BaseRecyclerAdapter
import com.example.kotlinnotes.models.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter(
    noteList: MutableList<Note> = mutableListOf()
): BaseRecyclerAdapter<Note>(noteList) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note,parent,false))


    class MyViewHolder(view: View):BaseViewHolder<Note>(view){
        override fun onBind(data: Note) {
            view.tv_note_item.text = data.description
        }
    }


}