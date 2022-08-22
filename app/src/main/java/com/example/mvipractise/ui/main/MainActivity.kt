package com.example.mvipractise.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvipractise.navigation.OnBoardingNavigation
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {
            ComposePractiseTheme {
                OnBoardingNavigation()
            }
        }
    }
}