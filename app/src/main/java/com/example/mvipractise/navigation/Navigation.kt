package com.example.mvipractise.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mvipractise.ui.auth.login.ShowLoginScreen
import com.example.mvipractise.ui.home.screen.HomeScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {

        composable(
            Screen.LoginScreen.route
        ) {

            ShowLoginScreen(navController = navController)

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

    }

}