package com.example.mvipractise.ui.auth.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mvipractise.R
import com.example.mvipractise.navigation.Screen
import com.example.mvipractise.ui.auth.screen.LoginScreen
import com.example.mvipractise.ui.home.HomeViewModel

@Composable
fun ShowLoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    navController: NavController
) {
    LoginScreen(
        email = viewModel.email.value,
        password = viewModel.password.value,
        isButtonClicked = false,
        setEmail = {
            viewModel.email.value = it
        },
        setPassword = {
            viewModel.password.value = it
        },
        callApi = {
            navController.navigate(
                Screen.HomeScreen.withArgs(viewModel.email.value)
            )
        },
        logo = R.drawable.logo
    )
}