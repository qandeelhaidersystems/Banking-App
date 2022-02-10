package com.example.mvipractise.ui.home.state

// ViewEffects which is based on SingleLiveEvent for actions that are more or less fire and forget
sealed class HomeViewEffect {

    object MoveToNextScreen : HomeViewEffect()

}