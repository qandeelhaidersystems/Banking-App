package com.example.mvipractise.core.db.helper

import com.example.mvipractise.core.db.tables.Notes
import kotlinx.coroutines.flow.Flow

interface DbHelper {

    suspend fun insertNote(notes: Notes)

    suspend fun getAllNotes(): Flow<List<Notes>>
}