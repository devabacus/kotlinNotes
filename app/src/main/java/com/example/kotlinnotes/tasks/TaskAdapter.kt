package com.example.kotlinnotes.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import com.example.kotlinnotes.foundations.BaseRecyclerAdapter
import com.example.kotlinnotes.models.Task
import kotlinx.android.synthetic.main.item_task.view.*

class TaskAdapter(
    taskList: MutableList<Task> = mutableListOf()
):BaseRecyclerAdapter<Task>(taskList) {

    class MyViewHolder(view: View):BaseViewHolder<Task>(view){
        override fun onBind(data: Task) {
            view.tv_task_item.text = data.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_task,parent,false))

}