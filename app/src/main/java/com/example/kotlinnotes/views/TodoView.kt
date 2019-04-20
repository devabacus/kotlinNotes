package com.example.kotlinnotes.views

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlinnotes.models.Todo
import kotlinx.android.synthetic.main.view_todo.view.*

class TodoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 1
) : ConstraintLayout(context, attrs, defStyleAttr) {

    fun initView(todo: Todo, callback: ((Boolean) -> Unit)?) {
        tv_description.text = todo.description
        cb_complete.isChecked = todo.isComplete
        if (todo.isComplete) {
            tv_description.setStrikeThrough()
        }
        setUpCheckStateListener(todo, callback)
    }

    fun setUpCheckStateListener(todo: Todo, callback: ((Boolean) -> Unit)? = null) {
        cb_complete.setOnCheckedChangeListener { _, isChecked ->
            todo.isComplete = isChecked
            callback?.invoke(isChecked)
            if (isChecked) {
                tv_description.setStrikeThrough()
            } else {
                tv_description.removeStrikeThrough()
            }
        }
    }
}
