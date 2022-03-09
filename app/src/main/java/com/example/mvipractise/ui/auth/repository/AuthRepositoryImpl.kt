package com.example.mvipractise.ui.auth.repository

import com.example.mvipractise.ui.auth.requests.LoginRequest
import com.example.mvipractise.ui.auth.requests.SignUpRequest
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(

) : AuthRepository {

    override suspend fun login(request: LoginRequest) {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(request: SignUpRequest) {
        TODO("Not yet implemented")
    }
}