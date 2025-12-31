package com.example.signupscreenui.presentation.screen.logInScreen

data class LoginState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)
