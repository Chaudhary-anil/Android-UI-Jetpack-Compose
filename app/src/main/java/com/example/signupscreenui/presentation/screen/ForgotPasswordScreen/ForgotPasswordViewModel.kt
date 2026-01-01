package com.example.signupscreenui.presentation.screen.ForgotPasswordScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ForgotPasswordViewModel : ViewModel() {
    var state by mutableStateOf(ForgotPasswordState())
        private set

    fun onEvent(event: ForgotPasswordEvent) {
        when(event) {
            is ForgotPasswordEvent.EmailChanged -> {
                state = state.copy(email = event.email)
            }
            ForgotPasswordEvent.ResetPasswordBtn -> forgotBtn()
        }
    }

    private fun forgotBtn() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            delay(5000)
            state = state.copy(isLoading = false, error = null)
        }
    }

}