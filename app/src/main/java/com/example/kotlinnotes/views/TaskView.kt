package com.example.kotlinnotes.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlinnotes.R
import com.example.kotlinnotes.models.Task
import kotlinx.android.synthetic.main.item_task.view.*

class TaskView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 1
) : ConstraintLayout(context, attrs, defStyleAttr) {

    lateinit var task: Task

    fun initView(task: Task, todoCheckedCallBack: (Int, Boolean) -> Unit) {
        this.task = task
        tv_task_item.text = task.title
        task.todo.forEachIndexed { todoIndex, todo ->
            val todoView =
                (LayoutInflater.from(context).inflate(R.layout.view_todo, todo_container, false) as TodoView).apply {
                    initView(todo) { isChecked ->
                        todoCheckedCallBack.invoke(todoIndex, isChecked)
                        if (isTaskComplete()) {
                            this@TaskView.tv_task_item.setStrikeThrough()
                        } else {
                            this@TaskView.tv_task_item.removeStrikeThrough()
                        }
                    }
                }
            todo_container.addView(todoView)
        }
    }
    fun isTaskComplete(): Boolean = task.todo.filter { !it.isComplete }.isEmpty()
}