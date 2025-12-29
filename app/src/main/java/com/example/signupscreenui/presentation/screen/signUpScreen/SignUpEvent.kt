package com.example.signupscreenui.presentation.screen.signUpScreen

sealed class SignUpEvent {
    data class EmailChanged(val email: String): SignUpEvent()
    data class PasswordChanged(val password: String): SignUpEvent()
    object Submit: SignUpEvent()
}