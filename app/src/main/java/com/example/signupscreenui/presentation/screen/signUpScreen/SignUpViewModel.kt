package com.example.signupscreenui.presentation.screen.signUpScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SignUpViewModel: ViewModel() {

    var state by mutableStateOf(SignupState())
        private set

    fun onEvent(event: SignUpEvent) {
        when(event) {
            is SignUpEvent.EmailChanged -> {
                state = state.copy(email = event.email)
            }
            is SignUpEvent.PasswordChanged -> {
                state = state.copy(password = event.password)
            }
            SignUpEvent.Submit -> submit()
        }
    }

    private fun submit() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            delay(5000)
            state = state.copy(isLoading = false, error = null)
        }
    }
}