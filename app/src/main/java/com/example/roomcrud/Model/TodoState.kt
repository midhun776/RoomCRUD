package com.example.roomcrud.Model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.roomcrud.database.TodoItem

data class TodoState(

    val notes: List<TodoItem> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf("")

)