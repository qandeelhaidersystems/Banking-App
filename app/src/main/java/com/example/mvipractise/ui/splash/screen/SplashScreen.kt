package com.example.mvipractise.ui.splash.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily

@Composable
fun SplashScreen(
    callback : () -> Unit
) {

    designSplashScreen(modifier = Modifier, callback)

}


@Composable
fun designSplashScreen(modifier: Modifier, callback : () -> Unit) {
    Column(

        modifier = modifier
            .fillMaxSize()
            .background(Colors.lightOrange),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {


        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo"
        )

        Text(
            text = "Finiti",
            fontSize = 65.sp,
            color = Colors.white,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            modifier = modifier
                .padding(top = 20.dp)
        )

        Text(
            text = "Money Transfer, Wallet & \nFinance UI Kit",
            fontSize = 18.sp,
            color = Colors.white,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,

            modifier = modifier
                .padding(top = 10.dp)
        )


        Button(
            modifier = modifier
                .fillMaxWidth(0.5f)
                .padding(top = 50.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(Colors.base),
            
            onClick = {
                callback.invoke()
            }
        ) {

            Text(text = "Get Started Now")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun displaySplashScreen() {

    designSplashScreen(modifier = Modifier){

    }

}