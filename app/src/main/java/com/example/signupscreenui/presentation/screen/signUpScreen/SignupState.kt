package com.example.signupscreenui.presentation.screen.signUpScreen

data class SignupState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)
