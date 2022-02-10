package com.example.mvipractise.ui.home.repository

import com.example.mvipractise.core.db.tables.Notes
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

    suspend fun insertNote(notes: Notes)

    suspend fun getAllNotes() : Flow<List<Notes>>
}