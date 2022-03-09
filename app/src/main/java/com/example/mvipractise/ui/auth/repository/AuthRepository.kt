package com.example.mvipractise.ui.auth.repository

import com.example.mvipractise.ui.auth.requests.LoginRequest
import com.example.mvipractise.ui.auth.requests.SignUpRequest

interface AuthRepository {

    suspend fun login(request : LoginRequest)

    suspend fun signUp(request: SignUpRequest)
}