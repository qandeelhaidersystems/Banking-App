package com.example.mvipractise.ui.auth.state

sealed class AuthAction {

    object LoginResponse : AuthAction()
    object SignResponse: AuthAction()

}