package com.example.mvipractise.ui.auth.state

import com.example.mvipractise.model.remote.homeFeedResponse.HomeFeedResponse

data class AuthDataState(
    val homeFeedResponse: HomeFeedResponse? = null
)