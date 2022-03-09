package com.example.mvipractise.ui.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.viewModels
import com.example.mvipractise.R
import com.example.mvipractise.core.base.BaseFragment
import com.example.mvipractise.ui.auth.screen.LoginScreen
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment: BaseFragment<LoginViewModel>() {

    private val viewModel by viewModels<LoginViewModel>()

    override fun getViewModels(): LoginViewModel {
        return viewModel
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {

            setContent {

                ComposePractiseTheme {




                }

            }

        }
    }

    @Preview
    @Composable
    fun showLoginScreen(){
        LoginScreen(
            email = "viewModel.email.value",
            password = "viewModel.password.value",
            isButtonClicked = false,
            setEmail = {

            },
            setPassword = {
            },
            callApi = {
            },
            logo = R.drawable.logo
        )
    }
}