package com.example.mvipractise.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvipractise.navigation.OnBoardingNavigation
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
                OnBoardingNavigation()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}