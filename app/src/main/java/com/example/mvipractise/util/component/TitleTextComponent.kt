package com.example.mvipractise.util.component

import androidx.compose.foundation.layout.fillMaxWidth
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
fun TitleTextComponent(
    modifier : Modifier,
    text: String
) {

    Text(
        text = text,
        color = Colors.textBaseColor,
        fontSize = 44.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Start,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 70.dp)
    )
}