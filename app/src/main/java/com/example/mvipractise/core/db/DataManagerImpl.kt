package com.example.mvipractise.core.db

import com.example.mvipractise.core.db.helper.DbHelper
import com.example.mvipractise.core.db.tables.Notes
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManagerImpl @Inject constructor(
private val dbHelper: DbHelper
) : DataManager{

    override suspend fun insertNote(notes: Notes) {
        dbHelper.insertNote(notes = notes)
    }

    override suspend fun getAllNotes(): Flow<List<Notes>> {
        return dbHelper.getAllNotes()
    }

}