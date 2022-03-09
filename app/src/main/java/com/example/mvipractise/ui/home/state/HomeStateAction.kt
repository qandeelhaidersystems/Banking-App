package com.example.mvipractise.ui.home.state

sealed class HomeStateAction {

    object GetHomeList : HomeStateAction()

    object GetNotes : HomeStateAction()

}