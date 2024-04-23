package com.example.roomcrud.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao
interface TodoItemDao {

    @Upsert
    suspend fun upsertNote(todoItem: TodoItem)

    @Delete
    suspend fun deleteNote(todoItem: TodoItem)

    @Query("SELECT * FROM todoItem ORDER BY dateAdded")
    fun getNotesOrderdByDateAdded(): Flow<List<TodoItem>>


    @Query("SELECT * FROM todoItem ORDER BY title ASC")
    fun getNotesOrderdByTitle(): Flow<List<TodoItem>>

}