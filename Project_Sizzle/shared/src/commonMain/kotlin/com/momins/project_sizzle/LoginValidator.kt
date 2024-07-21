package com.momins.project_sizzle

class LoginValidator {

    var errorMessage: String? = null
        private set

    private val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

    fun validate(email: String, password: String): Boolean {
        return isEmailValid(email) && isPasswordValid(password)
    }

    private fun isEmailValid(email: String): Boolean {
        return if (email.isBlank()) {
            errorMessage = AppConstants().errorEmptyEmail
            return false
        } else if (emailRegex.matches(email)) {
            true
        } else {
            errorMessage = AppConstants().errorInvalidEmail
            false
        }
    }

    private fun isPasswordValid(password: String): Boolean {
        return if (password.isBlank()) {
            errorMessage = AppConstants().errorEmptyPassword
            false
        } else if (password.length >= 6) {
            true
        } else {
            errorMessage = AppConstants().errorPasswordLength
            false
        }
    }

    fun resetError() {
        errorMessage = null
    }
}

class AppConstants {

        var placeholderEmail = "Email"
        val placeholderPassword = "Password"

        val buttonSignIn = "Sign In"

        val errorInvalidEmail = "Invalid Email Id"
        val errorEmptyEmail = "Email Field cannot be empty"
        val errorPasswordLength = "Password must be at least 6 characters long"
        val errorEmptyPassword = "Password field cannot be empty"

}