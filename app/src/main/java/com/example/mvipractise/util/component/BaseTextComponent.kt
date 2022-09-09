package com.example.mvipractise.util.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily

@Composable
fun BaseTextComponent(
    modifier : Modifier,
    text : String,
    fontSize : Int = 14,
    color : Color = Colors.textBaseColor,
    fontWeight: FontWeight = FontWeight.Light
) {

    Text(
        text = text,
        color = color,
        fontSize = fontSize.sp,
        fontFamily = fontFamily,
        fontWeight = fontWeight,
        textAlign = TextAlign.Center,
        modifier = modifier
    )

}