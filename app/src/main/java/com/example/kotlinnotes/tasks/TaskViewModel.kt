package com.example.kotlinnotes.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinnotes.models.Task

class TaskViewModel : ViewModel(), TaskListViewContract {

    private val model: TaskModel = TaskModel()
    override fun onTodoUpdated(taskIndex: Int, todoIndex: Int, isCompleted: Boolean) {
        _taskListLiveData.value?.get(taskIndex)?.todo?.get(todoIndex)?.isComplete = isCompleted
    }

    private val _taskListLiveData: MutableLiveData<MutableList<Task>> = MutableLiveData()
    val taskListLiveData: LiveData<MutableList<Task>> = _taskListLiveData


    init {
        _taskListLiveData.postValue(model.getFakeData())
    }


}