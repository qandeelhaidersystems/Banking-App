package com.example.mvipractise.auth.registration

object RegistrationUtil {

    private val existingUser = listOf("ali", "haider")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }

        if (password !== confirmPassword){
            return false
        }

        if (password.length < 2){
            return false
        }

        if (username in existingUser){
            return false
        }

        return true
    }

}