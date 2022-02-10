package com.example.mvipractise.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun Logo(
    painter: Painter,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier.height(150.dp).width(150.dp)) {
        Image(
            painter = painter,
            contentDescription = "contentDescription")
    }

}