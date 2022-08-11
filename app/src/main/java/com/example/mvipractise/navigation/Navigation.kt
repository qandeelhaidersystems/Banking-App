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
import com.example.mvipractise.ui.home.screen.HomeScreen
import com.example.mvipractise.ui.onBoarding.screens.OnBoardingScreen
import com.example.mvipractise.ui.splash.screen.SplashScreen
import com.example.mvipractise.ui.onBoarding.screens.WelcomeScreen
import com.example.mvipractise.ui.onBoarding.util.OnBoardingPage
import com.example.mvipractise.util.Constants

@Composable
fun OnBoardingNavigation() {

    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavHost(
                navController = navController,
                startDestination = Screen.splashScreen.route
            ) {

                composable(Screen.splashScreen.route) {
                    SplashScreen{
                        navController.navigate(Screen.OnBoardingScreen1.route)
                    }
                }

                composable(Screen.OnBoardingScreen1.route) {
                    OnBoardingScreen(
                        onBoardingPage = OnBoardingPage.First
                    ){
                        if (it == Constants.SKIP) {
                            navController.navigate(Screen.WelcomeScreen.route)
                        }
                        if (it == Constants.NEXT) {
                            navController.navigate(Screen.OnBoardingScreen2.route)
                        }
                    }
                }

                composable(Screen.OnBoardingScreen2.route) {
                    OnBoardingScreen(
                        onBoardingPage = OnBoardingPage.Second
                    ){
                        if (it == Constants.SKIP) {
                            navController.navigate(Screen.WelcomeScreen.route)
                        }
                        if (it == Constants.NEXT) {
                            navController.navigate(Screen.OnBoardingScreen3.route)
                        }
                    }
                }

                composable(Screen.OnBoardingScreen3.route) {
                    OnBoardingScreen(
                        onBoardingPage = OnBoardingPage.Third
                    ){
                        navController.navigate(Screen.WelcomeScreen.route)
                    }
                }

                composable(Screen.WelcomeScreen.route) {
                    WelcomeScreen(navController = navController)
                }

                composable(
                    route = Screen.HomeScreen.route + "/{email}",
                    arguments = listOf(
                        navArgument("email"){
                            type = NavType.StringType
                            defaultValue = "nothing"
                            nullable = true
                        }
                    )
                ) { entry ->
                    HomeScreen(email = entry.arguments?.getString("email"))
                }

                composable(Screen.LoginScreen.route) {
                    ShowLoginScreen(navController = navController)
                }

            }
        }
    }

}