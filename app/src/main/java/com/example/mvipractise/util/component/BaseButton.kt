package com.example.mvipractise.util.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily

@Composable
fun BaseButton(
    modifier: Modifier,
    text: String,
    enable: Boolean
) {

    Button(
        modifier = modifier.height(40.dp),
        shape = RoundedCornerShape(10.dp),
        enabled = enable,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Colors.lightOrange,
        )
        ,
        onClick = {}) {

        Text(
            text = text,
            color = Colors.white,
            fontSize = 14.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = modifier
        )
    }

}