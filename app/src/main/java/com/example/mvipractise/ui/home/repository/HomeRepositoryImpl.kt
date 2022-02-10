package com.example.mvipractise.ui.home.repository

import com.example.mvipractise.core.db.tables.Notes
import com.example.mvipractise.network.HomeApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class HomeRepositoryImpl @Inject constructor(
    private val homeApi: HomeApi
): HomeRepository {

    override suspend fun insertNote(notes: Notes) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllNotes(): Flow<List<Notes>> {
        TODO("Not yet implemented")
    }
}