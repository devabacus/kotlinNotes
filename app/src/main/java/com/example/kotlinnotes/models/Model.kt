package com.example.kotlinnotes.models

data class Task(
    var title: String,
    val todo: List<Todo> = mutableListOf(),
    var tag: Tag? = null
) {
}

data class Todo(
    var description: String,
    var isComplete: Boolean = false
)

data class Note(
    var description: String,
    var tag: Tag? = null
)

data class Tag(
    val name: String,
    val colourResId: Int
)

