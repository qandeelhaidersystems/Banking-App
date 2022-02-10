package com.example.mvipractise.auth.registration

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `username is empty returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        Truth.assertThat(result).isFalse()

    }

    @Test
    fun `password is empty returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "qandeel",
            "",
            "123"
        )

        Truth.assertThat(result).isFalse()

    }

    @Test
    fun `confirm password is empty returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "qandeel",
            "123",
            ""
        )

        Truth.assertThat(result).isFalse()

    }

    @Test
    fun `password and confirm password are not same returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "qandeel",
            "123",
            "124"
        )

        Truth.assertThat(result).isFalse()

    }

    @Test
    fun `password is not less than 2 characters returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "qandeel",
            "1",
            "1"
        )

        Truth.assertThat(result).isFalse()

    }


    @Test
    fun `valid username and password returns true`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "qandeel",
            "123",
            "123"
        )

        Truth.assertThat(result).isTrue()

    }


}