package com.example.mvipractise

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class BaseApp @Inject constructor() : Application() {
}