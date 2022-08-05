package com.example.mvipractise.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvipractise.core.db.dao.NotesDao
import com.example.mvipractise.core.db.tables.Notes


@Database(
    entities = [
        Notes::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun notesDao(): NotesDao

}