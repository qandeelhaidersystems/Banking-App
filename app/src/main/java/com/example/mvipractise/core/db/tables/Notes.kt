package com.example.mvipractise.core.db.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Notes (
    val title: String,
    val description: String,
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
)