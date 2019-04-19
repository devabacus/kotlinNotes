package com.example.kotlinnotes.tasks

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinnotes.models.Task
import kotlinx.android.synthetic.main.fragment_task_list.view.*

class TaskListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 1
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private lateinit var adapter: TaskAdapter
    private lateinit var touchActionDelegate: TaskListFragment.TouchActionDelegate
    private lateinit var dataActionDelegate: TaskListViewContract

    fun initView(taDelegate: TaskListFragment.TouchActionDelegate, daActionDelegate: TaskListViewContract) {
        setDelegates(taDelegate, daActionDelegate)
        setUpView()
    }

    fun setDelegates(taDelegate: TaskListFragment.TouchActionDelegate, daActionDelegate: TaskListViewContract) {
        touchActionDelegate = taDelegate
        dataActionDelegate = daActionDelegate
    }

    fun setUpView() {
        recycler_view.layoutManager = LinearLayoutManager(context)
        adapter = TaskAdapter(
            touchActionDelegate = touchActionDelegate,
            dataActionDelegate = dataActionDelegate
        )
        recycler_view.adapter = adapter
    }

    fun updateList(list: List<Task>) {
        adapter.updateList(list)
    }

}