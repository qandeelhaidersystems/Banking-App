package com.example.mvipractise.util.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.mvipractise.ui.theme.Colors

@Composable
fun EditTextComponent(
    modifier: Modifier,
    hint: String,
    getValue: String,
    keyboardType: KeyboardType,
    setValue: (String) -> Unit,
) {

    TextField(
        value = getValue,
        onValueChange = {
            setValue.invoke(it)
        },
        label = { BaseTextComponent(modifier, hint) },
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(5.dp),
        modifier = modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Colors.lightGray,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
         )

    )


}