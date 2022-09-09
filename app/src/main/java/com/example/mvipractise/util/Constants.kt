package com.example.mvipractise.util

import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.example.mvipractise.ui.theme.Colors

class Constants {

    companion object {

        const val API_KEY = "apikey"
        const val LANGUAGE = "lang"
        const val CURRENCY = "currency"
        const val USER_TOKEN = "usertoken"
        const val DEVICE_TYPE = "device_type"
        const val ANDROID = "android"

        const val SPLASH_SCREEN = "splashScreen"
        const val ON_BOARDING_SCREEN_1 = "onBoardingScreen1"
        const val ON_BOARDING_SCREEN_2 = "onBoardingScreen2"
        const val ON_BOARDING_SCREEN_3 = "onBoardingScreen3"
        const val WELCOME_SCREEN = "welcomeScreen"


        const val SIGN_UP_SCREEN = "signUpScreen"

        const val SKIP = "skip"
        const val NEXT = "next"

        val termsOfPrivacyPolicy = buildAnnotatedString {
            //append your initial text
            withStyle(
                style = SpanStyle(
                    color = Colors.Gray,
                )
            ) {
                append("I’ve read and agree to the ")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.baseLight,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("terms")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.Gray,
                )
            ) {
                append(" of ")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.baseLight,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("privacy policy")
            }

        }


        val enterYourPhoneNumber = buildAnnotatedString {
            //append your initial text
            withStyle(
                style = SpanStyle(
                    color = Colors.Gray,
                )
            ) {
                append("Please enter ")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.black,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("your phone number")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.Gray,
                )
            ) {
                append("  and \n")
            }


            withStyle(
                style = SpanStyle(
                    color = Colors.black,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("location")
            }

            withStyle(
                style = SpanStyle(
                    color = Colors.Gray,
                )
            ) {
                append("  so we can verify you.")
            }

        }
    }
}