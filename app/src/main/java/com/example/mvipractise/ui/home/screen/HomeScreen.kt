package com.example.mvipractise.ui.home.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout

@Composable
fun HomeScreen(
//    modifier: Modifier,
//    noOfColumn: Int = 2,
//    content: @Composable () -> Unit

    email: String?
) {


//    Layout(
//        content = content,
//        modifier = modifier
//    ) { measureable, constraints ->
//
//        val columnWidth = (constraints.maxWidth / noOfColumn)
//        val itemConstraint = constraints.copy(maxWidth = columnWidth)
//
//        val columnHeight = IntArray(noOfColumn){0}
//
//        val placeables = measureable.map { measurable ->
//
//        }
//
//    }

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Text(text = email.toString())
    }


}