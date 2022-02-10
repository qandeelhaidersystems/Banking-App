package com.example.mvipractise.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvipractise.ui.theme.Colors

@Composable
fun CircularProgressBar(isShow: Boolean){
    if (isShow){
        Row(
            modifier = Modifier
                .width(70.dp)
                .height(40.dp)
                .background(Colors.base, shape = RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircularProgressIndicator(
                color = Colors.baseLight,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
        }
    }
}
