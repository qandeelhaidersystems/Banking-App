package com.example.mvipractise.util.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily

@Composable
fun BaseTextComponent(
    modifier : Modifier,
    text : String,
    fontSize : Int = 14,

) {

    Text(
        text = text,
        color = Colors.textBaseColor,
        fontSize = fontSize.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Center,
        modifier = modifier
            .padding(10.dp)
    )

}