package com.example.mvipractise.auth.login

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class LoginUtilTest{

    @Test
    fun `username is empty`(){

        val result = LoginUtil.validateLoginInput(
            "",
            "123"
        )

        assertThat(result).isTrue()

    }



}