package com.example.mvipractise.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.mvipractise.ui.main.MainActivity
import com.example.mvipractise.ui.splash.screen.SplashScreen
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {
            ComposePractiseTheme {
                SplashScreen {
                    openMainActivity()
                }
            }
        }

        observeLoading()

    }

    private fun observeLoading(){
        lifecycleScope.launch {
            viewModel.isLoading.collect {
                if (it) {
                    openMainActivity()
                }
            }
        }
    }

    fun openMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}