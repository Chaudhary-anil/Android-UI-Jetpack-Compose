package com.example.signupscreenui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.signupscreenui.presentation.screen.signUpScreen.SignUpScreen
import com.example.signupscreenui.presentation.screen.signUpScreen.SignUpViewModel
import com.example.signupscreenui.ui.theme.SignupScreenUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SignupScreenUiTheme {
                val viewModel: SignUpViewModel = viewModel()
                SignUpScreen(
                    state = viewModel.state,
                    onEvent = viewModel::onEvent
                )
            }
        }
    }
}
