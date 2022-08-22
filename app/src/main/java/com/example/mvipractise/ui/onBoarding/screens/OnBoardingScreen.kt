package com.example.mvipractise.ui.onBoarding.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
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
import com.example.mvipractise.ui.onBoarding.util.OnBoardingPage
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily
import com.example.mvipractise.util.Constants

@Composable
fun OnBoardingScreen(
    onBoardingPage: OnBoardingPage = OnBoardingPage.First,
    callback: (String) -> Unit
) {

    val modifier = Modifier
    
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 40.dp, end = 40.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            color = Colors.textBaseColor,
            text = Constants.SKIP.uppercase(),
            modifier = modifier
                .width(60.dp)
                .clickable {
                    callback.invoke(Constants.SKIP)
                }
                .align(Alignment.End)
                .padding(top = 60.dp),
            textAlign = TextAlign.End,
        )

        Image(
            painter = painterResource(id = onBoardingPage.image),
            contentDescription = onBoardingPage.title,
            modifier = modifier
                .fillMaxHeight(0.4f)
                .size(230.dp)
        )

        Text(
            text = onBoardingPage.title,
            color = Colors.textBaseColor,
            fontSize = 44.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp)
        )

        Text(
            text = onBoardingPage.subTitle,
            color = Colors.textBaseColor,
            fontSize = 18.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 0.dp, bottom = 0.dp)
        )

        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(bottom = 30.dp),
            Alignment.BottomStart
        ) {
            Row {

                Column(
                    modifier = modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {


                    Text(
                        text = "${onBoardingPage.position}/3",
                        fontSize = 18.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Start,
                    )

                }

                Column(
                    modifier = modifier.weight(1f),
                    horizontalAlignment = Alignment.End

                ) {
                    Button(

                        modifier = modifier
                            .padding(2.dp)
                            .size(70.dp)
                            .clip(CircleShape),

                        onClick = {
                            callback.invoke(Constants.NEXT)
                        }) {

                        Text(text = "Next")
                    }
                }
            }
        }
    }


}

@Composable
@Preview(showBackground = true)
fun FirstOnBoardingScreenPreview() {
    Column(modifier = Modifier.fillMaxSize()) {
        OnBoardingScreen(
            OnBoardingPage.First
        ) {}
    }
}

@Composable
@Preview(showBackground = true)
fun SecondOnBoardingScreenPreview() {
    Column(modifier = Modifier.fillMaxSize()) {
        OnBoardingScreen(
            OnBoardingPage.Second
        ) {}
    }
}

@Composable
@Preview(showBackground = true)
fun ThirdOnBoardingScreenPreview() {
    Column(modifier = Modifier.fillMaxSize()) {
        OnBoardingScreen(
            OnBoardingPage.Third
        ) {}
    }
}

