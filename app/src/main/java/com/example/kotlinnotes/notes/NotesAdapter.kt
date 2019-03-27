package com.example.kotlinnotes.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import com.example.kotlinnotes.models.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter (private val noteList: MutableList<Note> = mutableListOf()): RecyclerView.Adapter<NotesAdapter.MyViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false))

    override fun getItemCount() = noteList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(noteList[position])
    }

    class MyViewHolder (val view: View): RecyclerView.ViewHolder(view){
        fun onBind(note: Note) {
            view.tv_note_item.text = note.description
        }
    }

}