package com.example.signupscreenui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.signupscreenui.presentation.screen.logInScreen.LoginScreenUi
import com.example.signupscreenui.presentation.screen.logInScreen.LoginViewModel
import com.example.signupscreenui.presentation.screen.signUpScreen.SignUpScreenUi
import com.example.signupscreenui.presentation.screen.signUpScreen.SignUpViewModel
import com.example.signupscreenui.presentation.screen.signUpScreen.SignupState
import com.example.signupscreenui.ui.theme.SignupScreenUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SignupScreenUiTheme {
                val viewModel: LoginViewModel = viewModel()
//                val viewModel: SignUpViewModel = viewModel()
//                SignUpScreenUi(
//                    state = viewModel.state,
//                    event = viewModel :: onEvent
//                )
                LoginScreenUi(
                    state = viewModel.state,
                    event = viewModel :: onEvent
                )
            }
        }
    }
}
