package com.example.mvipractise.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvipractise.R
import com.example.mvipractise.navigation.Navigation
import com.example.mvipractise.ui.auth.screen.LoginScreen
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen().apply {
            setOnExitAnimationListener { viewProvider ->
                viewProvider.iconView
                    .animate()
                    .setDuration(2000L)
                    .alpha(0f)
                    .withEndAction {
                        viewProvider.remove()
                    }
                    .start()
            }
        }

        super.onCreate(savedInstanceState)


        setContent {
            ComposePractiseTheme {
//                LoginScreen(
//                    email = "haider.qandeel@gmail.com",
//                    password = "12345",
//                    isButtonClicked = true,
//                    callApi = {},
//                    setEmail = {},
//                    setPassword = {},
//                    logo = R.drawable.logo
//                )

                Navigation()
            }
        }
    }
}