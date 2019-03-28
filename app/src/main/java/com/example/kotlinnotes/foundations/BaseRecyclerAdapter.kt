package com.example.kotlinnotes.foundations

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.tasks.TaskAdapter

abstract class BaseRecyclerAdapter<T> (
    protected val masterList: MutableList<T> = mutableListOf()
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = masterList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TaskAdapter.AddButtonViewHolder) {
            holder.onBind(Unit)
        } else {
            (holder as BaseViewHolder<T>).onBind(masterList[position - 1])
        }

    }

    abstract class BaseViewHolder<E>(val view: View) : RecyclerView.ViewHolder(view) {
        abstract fun onBind(data: E)
    }

}