package com.example.mvipractise.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import com.example.mvipractise.R
import com.example.mvipractise.core.base.BaseFragment
import com.example.mvipractise.core.base.DataState
import com.example.mvipractise.ui.home.screen.LinearList
import com.example.mvipractise.ui.home.screen.LoginScreen
import com.example.mvipractise.ui.home.state.HomeViewEffect
import com.example.mvipractise.ui.home.state.HomeViewState
import com.example.mvipractise.ui.theme.ComposePractiseTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel>() {

    private val viewModel by viewModels<HomeViewModel>()


    override fun getViewModels(): HomeViewModel {
        return viewModel
    }

    @ExperimentalFoundationApi
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {

            setContent {
                ComposePractiseTheme {

                    Column {
//                        LoginScreen(
//                            email = viewModel.email.value,
//                            password = viewModel.password.value,
//                            isButtonClicked = viewModel.isButtonClicked.value,
//                            setEmail = {
//                                viewModel.email.value = it
//                            },
//                            setPassword = {
//                                viewModel.password.value = it
//                            },
//                            callApi = {
//                                viewModel.setIntent(it)
//                            },
//                            logo = R.drawable.logo
//                        )


                        viewModel.getAllNotes()

                        when (val state = viewModel.state.collectAsState().value) {
                            HomeViewModel.State.Loading -> {
                            }
                            is HomeViewModel.State.Data -> {
                                LinearList(list = state.data, modifier = Modifier)
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.dataStates.observe(viewLifecycleOwner, {
            displayData(it)
        })

        viewModel.viewEffect.observe(viewLifecycleOwner, {
            moveToNextScreen(it)
        })
    }

    private fun displayData(state: DataState<HomeViewState>) {

        when (state) {

            is DataState.Loading -> {
                Log.i("TAGGGGGG", "LOADING")
                Log.i("TAGGGGGG", viewModel.email.value)
                Log.i("TAGGGGGG", viewModel.password.value)

                viewModel.isButtonClicked.value = true
            }

            is DataState.Success -> {
                Log.i("TAGGGGGG", state.data.toString())
                viewModel.isButtonClicked.value = false
            }

            is DataState.Error -> {
                Log.i("TAGGGGGG", state.isErrorMessage().toString())
                viewModel.isButtonClicked.value = false
            }

        }
    }

    private fun moveToNextScreen(effect: HomeViewEffect) {

        when (effect) {

            is HomeViewEffect.MoveToNextScreen -> {
                // move to next screen
            }

        }
    }
}