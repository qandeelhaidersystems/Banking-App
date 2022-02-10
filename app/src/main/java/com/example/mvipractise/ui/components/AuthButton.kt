package com.example.mvipractise.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvipractise.ui.home.state.HomeStateAction
import com.example.mvipractise.ui.theme.Colors

@Composable
fun AuthButton(
    callApi : (HomeStateAction) -> Unit,
    visible: Boolean
){

    if (visible) {
        Button(
            modifier = Modifier.background(Colors.base, RoundedCornerShape(5.dp)),
            onClick = {
                callApi.invoke(HomeStateAction.GetHomeList)
            }) {
            Text(
                text = "Login",
                modifier = Modifier.background(Colors.base),
            )
        }
    }

}