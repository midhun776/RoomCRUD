package com.example.roomcrud.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class TodoItem(

    val title: String,
    val description: String,
    val dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
