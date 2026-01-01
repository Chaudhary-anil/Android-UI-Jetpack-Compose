package com.example.signupscreenui.presentation.screen.ForgotPasswordScreen

sealed interface ForgotPasswordEvent {
    data class EmailChanged(val email: String): ForgotPasswordEvent
    object ResetPasswordBtn: ForgotPasswordEvent
}