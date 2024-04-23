package com.example.roomcrud.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [TodoItem::class],
    version = 1
)
abstract class TodoListDatabase: RoomDatabase(){
    abstract val dao: TodoItemDao
}