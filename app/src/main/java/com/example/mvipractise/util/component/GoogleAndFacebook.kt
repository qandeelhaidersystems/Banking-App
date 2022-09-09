package com.example.mvipractise.util.component

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors

@Composable
fun GoogleAndFacebook(
    modifier : Modifier,
    context: Context
) {

    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Colors.lightGray),
            shape = RoundedCornerShape(5.dp),
            modifier = modifier.weight(1f),
            onClick = {

            }
        ) {

            BaseTextComponent(modifier = modifier.padding(10.dp), text = context.getString(R.string.google))

        }

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Colors.lightGray),
            shape = RoundedCornerShape(5.dp),
            modifier = modifier.weight(1f),
            onClick = {}
        ) {

            BaseTextComponent(modifier = modifier.padding(10.dp), text = context.getString(R.string.facebook))

        }

    }
}