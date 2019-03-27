package com.example.kotlinnotes.notes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter (private val dataSet: Array<String>):
    RecyclerView.Adapter<NotesAdapter.MyViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false) as TextView
        return MyViewHolder(textView)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    class MyViewHolder (val textView: TextView): RecyclerView.ViewHolder(textView)

}