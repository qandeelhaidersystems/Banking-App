package com.example.mvipractise.ui.auth.signUp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily
import com.example.mvipractise.util.component.*

@Composable
@Preview
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel()
) {

    val modifier = Modifier
    val context = LocalContext.current

    Column(
        modifier = modifier.padding(start = 30.dp, end = 30.dp)
    ) {

        TitleTextComponent(modifier = modifier, text = context.getString(R.string.register))

        Spacer(modifier = modifier.padding(top = 40.dp))

        GoogleAndFacebook(
            modifier = modifier, context = context
        )

        Spacer(modifier = modifier.padding(top = 20.dp))

        OrDashesComponent(modifier = modifier, text = context.getString(R.string.or))

        Spacer(modifier = modifier.padding(top = 20.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.first_name),
            getValue = viewModel.firstName.value,
        ) {
            viewModel.firstName.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.enter_email_address),
            getValue = viewModel.email.value,
        ) {
            viewModel.email.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.password),
            getValue = viewModel.password.value,
        ) {
            viewModel.password.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.confirm_password),
            getValue = viewModel.confirmPassword.value,
        ) {
            viewModel.confirmPassword.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))


        Row {


            Checkbox(
                checked = viewModel.isTermsOfPrivacyPolicy.value,
                onCheckedChange = {
                    viewModel.isTermsOfPrivacyPolicy.value = it
                },
                modifier =
                modifier
                    .background(Colors.lightGray)
                    .width(20.dp)
                    .height(20.dp),

                colors = CheckboxDefaults.colors(
                    checkedColor = Colors.textBaseColor,
                    uncheckedColor = Colors.lightGray
                )
            )

            Text(
                text = context.getString(R.string.read_terms_of_privacy_policy),
                color = Colors.textBaseColor,
                fontSize = 14.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(start = 10.dp, top = 5.dp)
            )

        }

        Spacer(modifier = modifier.padding(top = 10.dp))

    }

}