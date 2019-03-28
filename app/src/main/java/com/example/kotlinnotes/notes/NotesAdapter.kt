package com.example.kotlinnotes.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import com.example.kotlinnotes.foundations.BaseRecyclerAdapter
import com.example.kotlinnotes.models.Note
import com.example.kotlinnotes.views.NoteView
import kotlinx.android.synthetic.main.view_add_button.view.*
class NotesAdapter(
    noteList: MutableList<Note> = mutableListOf()
): BaseRecyclerAdapter<Note>(noteList) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        if (viewType == TYPE_AND_BUTTON) {
            AddButtonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_add_button, parent, false))
        } else {
            NoteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note,parent,false))
        }


    class NoteViewHolder(view: View):BaseViewHolder<Note>(view){
        override fun onBind(data: Note) {
            (view as NoteView).initView(data)
        }
    }

    class AddButtonViewHolder(view: View) : BaseRecyclerAdapter.AddButtonViewHolder(view) {
        override fun onBind(data: Unit) {
            view.button_text.text = view.context.getString(R.string.add_button_note)
        }
    }


}

