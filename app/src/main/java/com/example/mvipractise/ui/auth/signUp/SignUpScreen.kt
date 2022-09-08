package com.example.mvipractise.ui.auth.signUp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.util.component.*

@Composable
@Preview(showSystemUi = true)
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel()
) {

    val modifier = Modifier
    val context = LocalContext.current

    Column(
        modifier = modifier.padding(start = 30.dp, end = 30.dp)
    ) {

        TitleTextComponent(
            modifier =
            modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),

            text = context.getString(R.string.register)
        )

        Spacer(modifier = modifier.padding(top = 40.dp))

        GoogleAndFacebook(
            modifier = modifier, context = context
        )

        Spacer(modifier = modifier.padding(top = 20.dp))

        OrDashesComponent(modifier = modifier, text = context.getString(R.string.or))

        Spacer(modifier = modifier.padding(top = 20.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.full_name),
            getValue = viewModel.firstName.value,
            keyboardType = KeyboardType.Text

        ) {
            viewModel.firstName.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        EditTextComponent(
            modifier,
            hint = context.getString(R.string.enter_email_address),
            getValue = viewModel.email.value,
            keyboardType = KeyboardType.Email
        ) {
            viewModel.email.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        PasswordEditText(
            modifier,
            hint = context.getString(R.string.password),
            getValue = viewModel.password.value,
        ) {
            viewModel.password.value = it
        }

        Spacer(modifier = modifier.padding(top = 10.dp))

        PasswordEditText(
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

            BaseTextComponent(
                text = context.getString(R.string.read_terms_of_privacy_policy),
                modifier = modifier.padding(start = 10.dp)
            )

        }

        Spacer(modifier = modifier.padding(top = 60.dp))

        BaseButton(
            modifier = modifier.fillMaxWidth(),
            text = context.getString(R.string.register),
            enable = viewModel.isRegisterButtonEnabled.value
        )


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 30.dp),
            Alignment.BottomStart
        ) {
            Column {
                BaseTextComponent(
                    modifier = modifier,
                    text = context.getString(R.string.already_have_an_account)
                )

                Spacer(modifier = modifier.padding(top = 5.dp))

                BaseTextComponent(
                    modifier = modifier,
                    text = context.getString(R.string.login_cap)
                )
            }

        }
    }

}