package com.example.mvipractise.core.db.helper

import com.example.mvipractise.core.db.AppDatabase
import com.example.mvipractise.core.db.tables.Notes
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DbHelperImpl @Inject constructor(
    private val appDatabase: AppDatabase
) : DbHelper {

    override suspend fun insertNote(notes: Notes) {
       appDatabase.notesDao().insertNotes(notes = notes)
    }

    override suspend fun getAllNotes(): Flow<List<Notes>> {
        return appDatabase.notesDao().getAllNotes
    }
}