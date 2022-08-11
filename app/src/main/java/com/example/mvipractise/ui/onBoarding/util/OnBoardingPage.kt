package com.example.mvipractise.ui.onBoarding.util

import androidx.annotation.DrawableRes
import com.example.mvipractise.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val subTitle: String,
    val position: Int
) {

    object First : OnBoardingPage(
        image = R.drawable.on_borading_image_1,
        title = "Take hold of \nyour finances",
        subTitle = "Running your finances is easier with xyz",
        position = 1
    )

    object Second : OnBoardingPage(
        image = R.drawable.on_borading_image_2,
        title = "See where your \nmoney is going",
        subTitle = "Stay on top by effortlessly tracking your subscriptions & bills",
        position = 2
    )

    object Third : OnBoardingPage(
        image = R.drawable.on_borading_image_3,
        title = "Reach your \ngoals with ease",
        subTitle = "Use the smart saving features to manage your future goals and needs",
        position = 3
    )

}