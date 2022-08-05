package com.example.mvipractise.navigation

sealed class Screen(val route: String){
    object LoginScreen : Screen(route = "Login")
    object HomeScreen : Screen(route = "Home")

    fun withArgs(vararg args: String): String{

        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }

    }
}