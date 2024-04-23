package com.example.roomcrud.Model

import com.example.roomcrud.database.TodoItem

sealed interface TodoEvent {
    object SortNotes: TodoEvent

    data class DeleteNote(val note: TodoItem): TodoEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): TodoEvent
}