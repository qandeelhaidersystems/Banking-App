package com.example.mvipractise.ui.auth

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvipractise.navigation.AuthNavigation
import com.example.mvipractise.navigation.OnBoardingNavigation
import com.example.mvipractise.ui.main.MainViewModel
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {
            ComposePractiseTheme {
                AuthNavigation()
            }
        }
    }
}