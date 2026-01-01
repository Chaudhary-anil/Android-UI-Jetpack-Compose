package com.example.signupscreenui.presentation.screen.ForgotPasswordScreen

data class ForgotPasswordState(
    val email: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)