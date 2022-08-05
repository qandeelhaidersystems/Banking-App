package com.example.mvipractise.ui.auth.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvipractise.ui.components.AuthButton
import com.example.mvipractise.ui.components.CircularProgressBar
import com.example.mvipractise.ui.components.Logo
import com.example.mvipractise.ui.components.MaterializeEditText
import com.example.mvipractise.ui.home.state.HomeStateAction
import com.example.mvipractise.ui.theme.Colors


@Composable
fun LoginScreen(
    email: String,
    password: String,
    isButtonClicked: Boolean,
    callApi : (HomeStateAction) -> Unit,
    setEmail: (String) -> Unit,
    setPassword: (String) -> Unit,
    logo: Int
) {

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {},
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Colors.baseBackground)
                .padding(10.dp)

        ) {

            Logo(
                painter = painterResource(id = logo),
            )

            MaterializeEditText(hint = "Email", getValue = email, setValue = setEmail)

            Spacer(modifier = Modifier.height(20.dp))

            MaterializeEditText(hint = "Password", getValue = password, setValue = setPassword)

            Spacer(modifier = Modifier.height(50.dp))

            AuthButton(
                callApi = callApi,
                visible = !isButtonClicked
            )

            CircularProgressBar(isShow = isButtonClicked)

        }
    }
}