package com.example.mvipractise.ui.onBoarding.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvipractise.R
import com.example.mvipractise.navigation.Screen
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily

@Composable
@Preview
fun WelcomeScreen(navController: NavController? = null) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Colors.textBaseColor)
            .padding(start = 40.dp, end = 40.dp, top = 60.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = "welcomeScree",
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .size(195.dp)
        )


        Text(
            text = "Welcome",
            color = Color.White,
            fontSize = 44.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp)
        )

        Text(
            text = "Stay on top by effortlessly tracking your subscriptions & bills",
            color = Color.White,
            fontSize = 18.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 40.dp)
        )

        Box(
            modifier = Modifier.fillMaxSize().padding(bottom = 30.dp),
            Alignment.BottomCenter
        ) {

            Button(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(70.dp)
                    .fillMaxSize(),

                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.White
                ),

                onClick = {
                    navController?.navigate(Screen.LoginScreen.route)
                }) {

                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    modifier = Modifier.size(26.dp),
                    contentDescription = "Arrow"
                )

            }

        }

    }

}