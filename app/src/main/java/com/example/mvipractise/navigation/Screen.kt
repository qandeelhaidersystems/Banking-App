package com.example.mvipractise.navigation

import com.example.mvipractise.util.Constants

sealed class Screen(val route: String){
    object LoginScreen : Screen(route = "Login")
    object HomeScreen : Screen(route = "Home")
    object OnBoardingScreen1: Screen(route = Constants.ON_BOARDING_SCREEN_1)
    object OnBoardingScreen2: Screen(route = Constants.ON_BOARDING_SCREEN_2)
    object OnBoardingScreen3: Screen(route = Constants.ON_BOARDING_SCREEN_3)
    object WelcomeScreen: Screen(route = Constants.WELCOME_SCREEN)

    fun withArgs(vararg args: String): String{

        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }

    }
}