package com.example.mvipractise.ui.auth.login

import com.example.mvipractise.core.base.BaseViewModel
import com.example.mvipractise.ui.auth.state.AuthDataState
import com.example.mvipractise.ui.auth.state.AuthViewEffect
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

): BaseViewModel<AuthDataState, AuthViewEffect>() {



}