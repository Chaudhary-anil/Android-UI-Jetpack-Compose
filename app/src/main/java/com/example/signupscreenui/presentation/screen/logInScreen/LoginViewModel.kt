package com.example.signupscreenui.presentation.screen.logInScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel(){
    var state by mutableStateOf(LoginState())
        private set

    fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.EmailChanged -> {
                state = state.copy(email = event.email)
            }
            LoginEvent.ForgotPassword -> {

            }
            LoginEvent.Login -> login()
            is LoginEvent.PasswordChanged -> {
                state = state.copy(password = event.password)
            }
            LoginEvent.SignUp -> {

            }
        }
    }

    private fun login() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            delay(10000)
            state = state.copy(isLoading = false, error = null)
        }
    }
}