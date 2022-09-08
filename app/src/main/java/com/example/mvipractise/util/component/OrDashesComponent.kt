package com.example.mvipractise.util.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mvipractise.ui.theme.Colors

@Composable
fun OrDashesComponent(
    modifier: Modifier,
    text: String
) {

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Spacer(
            modifier = modifier
                .width(62.dp)
                .height(2.dp)
                .background(Colors.lightGray, RoundedCornerShape(2.dp))
        )

        BaseTextComponent(modifier = modifier.padding(10.dp), text = text)

        Spacer(
            modifier = modifier
                .width(62.dp)
                .height(2.dp)
                .background(Colors.lightGray, RoundedCornerShape(2.dp))
        )

    }

}