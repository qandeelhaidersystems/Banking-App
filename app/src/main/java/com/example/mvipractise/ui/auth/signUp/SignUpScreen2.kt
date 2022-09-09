package com.example.mvipractise.ui.auth.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mvipractise.R
import com.example.mvipractise.ui.theme.Colors
import com.example.mvipractise.ui.theme.fontFamily
import com.example.mvipractise.util.Constants
import com.example.mvipractise.util.component.*
import com.hbb20.CountryCodePicker

@Composable
@Preview(showSystemUi = true)
fun SignUpScreen2(
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

        Text(
            text = Constants.enterYourPhoneNumber,
            color = Colors.textBaseColor,
            fontSize = 18.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Start,
            modifier = modifier
        )

        Spacer(modifier = modifier.padding(top = 40.dp))

        BaseTextComponent(
            modifier = modifier,
            text = context.getString(R.string.enter_your_location),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = modifier.padding(top = 10.dp))

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Colors.lightWhite, RoundedCornerShape(5.dp)),
        ) {

            Row(
                modifier = modifier
                    .padding(10.dp)
                    .clickable (
                        onClick = {
                            CountryCodePicker(
                                context
                            )
                        }
                    )
            ) {

                Image(
                    painter = painterResource(id = R.drawable.flag),
                    contentDescription = "flag",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 20.dp)
                        .width(35.dp)
                        .height(23.dp)
                )
                
                Spacer(modifier = modifier.padding(start = 10.dp))

                Box(
                    modifier = modifier
                        .background(Colors.dullGray)
                        .fillMaxHeight()
                        .width(1.dp))

            }



        }


        Spacer(modifier = modifier.padding(top = 20.dp))

        BaseTextComponent(
            modifier = modifier,
            text = context.getString(R.string.enter_your_location),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = modifier.padding(top = 10.dp))

        EditTextComponent(
            modifier = modifier
                .fillMaxWidth(),
            getValue = viewModel.phoneNumber.value,
            keyboardType = KeyboardType.Phone,
            setValue = {
                viewModel.phoneNumber.value = it
            }
        )

        Spacer(modifier = modifier.padding(top = 30.dp))


        BaseButton(
            modifier = modifier.fillMaxWidth(),
            text = context.getString(R.string.register),
            enable = viewModel.isRegisterButtonEnabledPhoneNumber.value
        )

        Spacer(modifier = modifier.padding(top = 20.dp))

        OrDashesComponent(
            modifier = modifier,
            text = context.getString(R.string.or)
        )

        Spacer(modifier = modifier.padding(top = 20.dp))

        GoogleAndFacebook(
            modifier = modifier,
            context = context
        )

        AlreadyHaveLoginComponent(
            modifier = modifier,
            context = context
        )


    }


}