package com.example.mvipractise.core.base

sealed class DataState<out T>{

    // These are all the base models which is common in every request
    data class Success<T>(val data: T?) : DataState<T>()

    data class Error<T>(val data: T?, val exception: Exception) : DataState<T>()

    data class Loading<T>(val data: T?) : DataState<T>()

    //Helper methods that make it easy to access the sealed class contents in xml data binding
    fun toData() : T? = when(this){

        is Success -> this.data

        is Error -> this.data

        is Loading -> this.data

    }

    fun isLoading() : Boolean? = if (this is Loading) true else null

    fun isErrorMessage(): String? = if (this is Error) this.exception.message else null

}