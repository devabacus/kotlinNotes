package com.example.kotlinnotes.tasks

interface TaskListViewContract {
    fun onTodoUpdated(taskIndex: Int, todoIndex: Int, isCompleted: Boolean)
}