package com.example.mvipractise.core.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

// S represents view state
// E represents view effect
abstract class BaseViewModel<S, E> : ViewModel() {

    //It will be accessed by child classes to update the view states
    protected val _dataStates : MutableLiveData<DataState<S>> = MutableLiveData()

    //Will be accessed by the view to observe view state updates
    val dataStates: LiveData<DataState<S>> = _dataStates

    //It will be accessed by child classes to update the view effects
    protected val _viewEffects: SingleLiveEvent<E> = SingleLiveEvent()

    //It will be accessed by the view to observe view effects updates
    val viewEffect: SingleLiveEvent<E> = _viewEffects

    //This is a wrapper for making network/room calls
    //This way we don't have to manually set our error and loading states in our child view models.
    protected fun launchRequest(block: suspend () -> Unit): Job{

        val currentViewState = getViewState()

        return viewModelScope.launch {

            try {
                _dataStates.postValue(DataState.Loading(currentViewState))
                block()
            }catch (exception: Exception){
                _dataStates.postValue(DataState.Error(currentViewState, exception))
            }

        }

    }

    fun getViewState() : S? {
        return _dataStates.value?.toData()
    }
}