package com.example.kotlinnotes.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.kotlinnotes.R
import com.example.kotlinnotes.models.Task
import com.example.kotlinnotes.models.Todo
import kotlinx.android.synthetic.main.fragment_task_list.*

class TaskListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_list, container, false)
    }

    companion object {
        fun newInstance(): TaskListFragment {
            return TaskListFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.layoutManager = LinearLayoutManager(context)
        val adapter = TaskAdapter(
            mutableListOf(
                    Task("one task", mutableListOf(
                        Todo("todo_one", true),
                        Todo("todo_two", true)
                    )),
            Task("second task")
        )
        )
        recycler_view.adapter = adapter

    }
}
