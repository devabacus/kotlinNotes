package com.example.kotlinnotes.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinnotes.R
import com.example.kotlinnotes.foundations.BaseRecyclerAdapter
import com.example.kotlinnotes.models.Task
import com.example.kotlinnotes.views.TaskView
import kotlinx.android.synthetic.main.item_task.view.*
import kotlinx.android.synthetic.main.view_add_button.view.*

class TaskAdapter(
    taskList: MutableList<Task> = mutableListOf()
) : BaseRecyclerAdapter<Task>(taskList) {

    override fun getItemViewType(position: Int): Int =
        if (position == 0) {
        TYPE_AND_BUTTON
    } else {
        TYPE_INFO
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        if (viewType == TYPE_INFO) {
            TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false))
        } else {
            AddButtonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_add_button, parent, false))
        }

    override fun getItemCount(): Int = masterList.size + 1

    class TaskViewHolder(view: View) : BaseViewHolder<Task>(view) {
        override fun onBind(data: Task) {
            (view as TaskView).initView(data)
            view.tv_task_item.text = data.title
        }
    }

    class AddButtonViewHolder(view: View) : BaseViewHolder<Unit>(view) {
        override fun onBind(data: Unit) {
            view.button_text.text = view.context.getString(R.string.add_button_task)
        }

    }

    companion object {
        const val TYPE_AND_BUTTON = 0
        const val TYPE_INFO = 1
    }



}