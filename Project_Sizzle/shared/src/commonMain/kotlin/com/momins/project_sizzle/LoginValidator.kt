package com.momins.project_sizzle

class LoginValidator {
    fun validateEmail(email: String): Boolean {
        return true
    }

    fun validatePassword(password: String): Boolean {
        return password.length >= 6
    }
}