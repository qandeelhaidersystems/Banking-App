package com.example.mvipractise.ui.home.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvipractise.core.db.tables.Notes

@ExperimentalFoundationApi
@Composable
fun LinearList(
    list: List<Notes>,
    modifier: Modifier
) {

    LazyVerticalGrid(cells = GridCells.Fixed(2)) {

        itemsIndexed(
            list
        ) { _, item ->

            Column {

                Spacer(modifier = modifier.height(40.dp))

                Text(
                    text = item.title,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .fillMaxWidth(),
                    style = TextStyle(color = Color.Black, fontSize = 25.sp)
                )

                Spacer(modifier = modifier.height(20.dp))

                Text(
                    text = item.description,
                    fontWeight = FontWeight.Light,
                    modifier = modifier
                        .fillMaxWidth(),
                    style = TextStyle(color = Color.Black, fontSize = 15.sp)
                )
            }
        }

    }
}