package com.example.signupscreenui.presentation.screen.logInScreen

sealed interface LoginEvent {
    data class EmailChanged(val email: String) : LoginEvent
    data class PasswordChanged(val password: String) : LoginEvent
    object Login: LoginEvent
    object ForgotPassword: LoginEvent
    object SignUp: LoginEvent
}