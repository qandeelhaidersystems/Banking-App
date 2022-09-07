package com.example.mvipractise.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mvipractise.ui.auth.login.ShowLoginScreen
import com.example.mvipractise.ui.auth.signUp.SignUpScreen
import com.example.mvipractise.ui.home.screen.HomeScreen
import com.example.mvipractise.ui.onBoarding.screens.OnBoardingScreen
import com.example.mvipractise.ui.onBoarding.screens.WelcomeScreen
import com.example.mvipractise.ui.onBoarding.util.OnBoardingPage
import com.example.mvipractise.util.Constants

@Composable
fun AuthNavigation() {

    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavHost(
                navController = navController,
                startDestination = Screen.SignUpScreen.route
            ) {

                composable(Screen.SignUpScreen.route) {
                    SignUpScreen()
                }


            }
        }
    }

}