package com.example.mvipractise.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.viewModels
import com.example.mvipractise.core.base.BaseFragment
import com.example.mvipractise.core.base.DataState
import com.example.mvipractise.ui.home.screen.LinearList
import com.example.mvipractise.ui.home.state.HomeStateAction
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {

            setContent {
                ComposePractiseTheme {

                    Column {
                        /*LoginScreen(
                            email = viewModel.email.value,
                            password = viewModel.password.value,
                            isButtonClicked = viewModel.isButtonClicked.value,
                            setEmail = {
                                viewModel.email.value = it
                            },
                            setPassword = {
                                viewModel.password.value = it
                            },
                            callApi = {
                                viewModel.setIntent(it)
                            },
                            logo = R.drawable.logo
                        )*/

                        viewModel.setIntent(HomeStateAction.GetNotes)

//                        DisplayData()

                        viewModel.viewEffect.observe(viewLifecycleOwner) {
                            moveToNextScreen(it)
                        }
//                        viewModel.getAllNotes()
//
//                        when (val state = viewModel.state.collectAsState().value) {
//                            HomeViewModel.State.Loading -> {
//                            }
//                            is HomeViewModel.State.Data -> {
//                                LinearList(list = state.data, modifier = Modifier)
//                            }
//                        }
                    }
                }
            }
        }
    }

    @ExperimentalFoundationApi
    @Composable
    private fun DisplayData() {

        val state by viewModel.dataStates.observeAsState()

        when (state) {

            is DataState.Loading -> {
                viewModel.isButtonClicked.value = true
            }

            is DataState.Success -> {
                viewModel.isButtonClicked.value = false

                (state as DataState.Success<HomeViewState>).toData()?.let { it ->

                    it.data?.let { list ->
                        Log.i("TAGGGGGG", list.toString())
                    }

                    it.allNotes?.let { list ->
                        Log.i("TAGGGGGG 1", list.toString())
                        LinearList(list = list, modifier = Modifier)
                    }
                }
            }

            is DataState.Error -> {
                Log.i("TAGGGGGG", (state as DataState.Error<HomeViewState>).isErrorMessage().toString())
                viewModel.isButtonClicked.value = false
            }

            else -> {

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