package com.example.mvipractise.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.mvipractise.core.base.BaseViewModel
import com.example.mvipractise.core.base.DataState
import com.example.mvipractise.core.db.DataManager
import com.example.mvipractise.core.db.tables.Notes
import com.example.mvipractise.network.HomeApi
import com.example.mvipractise.ui.home.repository.HomeRepository
import com.example.mvipractise.ui.home.state.HomeStateAction
import com.example.mvipractise.ui.home.state.HomeViewEffect
import com.example.mvipractise.ui.home.state.HomeViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
repository: HomeRepository,
private val homeApi: HomeApi,
private val dataManager: DataManager
): BaseViewModel<HomeViewState, HomeViewEffect>() {

    var email = mutableStateOf("")
    var password = mutableStateOf("")
    var isButtonClicked = mutableStateOf(false)

    var notes = MutableLiveData<List<Notes>>()

    private var _state = MutableStateFlow<State>(State.Loading)
    val state = _state.asStateFlow()

    init {
        _dataStates.value = DataState.Success(HomeViewState())
    }

    sealed class State {
        object Loading: State()
        data class Data(val data: List<Notes>): State()
    }

    fun setIntent(action: HomeStateAction) {
        when(action) {
            is HomeStateAction.GetHomeList -> {
                callApi()
            }
        }
    }

    private fun callApi(){
        val currentViewState = getViewState()
        launchRequest {
            val data = homeApi.getHomeFeed(1)
            val newViewState = currentViewState?.copy(data = data.data.banners)
            _dataStates.postValue(DataState.Success(newViewState))
        }
        insertNotes()
    }

    private fun moveToNextScreen() {
        _viewEffects.value = HomeViewEffect.MoveToNextScreen
    }

    private fun insertNotes(){
        viewModelScope.launch {
            val note = Notes(
                title = "my title",
                description = "my description"
            )
            dataManager.insertNote(note)
        }
    }


    fun getAllNotes() {
        viewModelScope.launch {
            dataManager.getAllNotes().collect {
                notes.value = it

                _state.value = State.Data(it)
            }
        }
    }

}