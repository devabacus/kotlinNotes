package com.example.kotlinnotes.tasks

import com.example.kotlinnotes.models.Task
import com.example.kotlinnotes.models.Todo

class TaskModel {

    fun getFakeData(): MutableList<Task> = mutableListOf(
        Task(
            "one task", mutableListOf(
                Todo("todo_one", true),
                Todo("todo_two", true)
            )
        ),
        Task("second task"),
        Task(
            "buy products", mutableListOf(
                Todo("milk", false),
                Todo("bread", false),
                Todo("fruits", false)
            )
        )
    )
}