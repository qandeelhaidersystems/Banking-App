package com.example.mvipractise.util.component

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors

@Composable
fun AlreadyHaveLoginComponent(
    modifier: Modifier,
    context: Context,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp),
        Alignment.BottomStart
    ) {
        Column {
            BaseTextComponent(
                modifier = modifier,
                text = context.getString(R.string.already_have_an_account)
            )

            Spacer(modifier = modifier.padding(top = 5.dp))

            Row {
                BaseTextComponent(
                    modifier = modifier,
                    text = context.getString(R.string.login_cap),
                    color = Colors.base,
                    fontWeight = FontWeight.Bold
                )

                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "Arrow",
                    modifier = modifier.padding(start = 15.dp, top = 5.dp).height(10.dp).width(10.dp)
                )
            }
        }

    }

}