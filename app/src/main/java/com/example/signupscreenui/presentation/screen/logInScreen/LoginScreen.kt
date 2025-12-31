package com.example.signupscreenui.presentation.screen.logInScreen

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreenUi(
    state: LoginState,
    event: (LoginEvent) -> Unit
) {
    val context = LocalContext.current

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Spacer(Modifier.height(20.dp))
                Text("Login", style = MaterialTheme.typography.headlineLarge)
                Spacer(Modifier.height(100.dp))
                EmailField(
                    value = state.email,
                    onChange = { event(LoginEvent.EmailChanged(it)) }
                )

                PasswordField(value = state.password) { event(LoginEvent.PasswordChanged(it)) }

                Button(
                    onClick = { event(LoginEvent.Login) },
                    enabled = !state.isLoading,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    if (state.isLoading) {
                        CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp)
                    } else {
                        Text("Login")
                    }
                }
                Text("Forgot Password?", textDecoration = TextDecoration.Underline)
            }

            Column {
                Text("Don't have an account?")
                Text(
                    "Sign Up",
                    style = TextStyle(
                        textDecoration = TextDecoration.Underline,
                        color = Color.Red
                    ),
                    modifier = Modifier
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) {
                            Toast.makeText(context, "Sign Up Clicked!", Toast.LENGTH_SHORT).show()
                        }
                )
            }
        }
    }
}