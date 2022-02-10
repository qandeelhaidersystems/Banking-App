package com.example.mvipractise.ui.home.state

import com.example.mvipractise.core.db.tables.Notes
import com.example.mvipractise.model.remote.homeFeedResponse.HomeBanner

data class HomeViewState (
    val data: List<HomeBanner>? = null,
    val allNotes: List<Notes>? = null
)