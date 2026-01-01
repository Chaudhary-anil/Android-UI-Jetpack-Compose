Login Screen UI (Jetpack Compose)
This is a simple Login Screen UI made using Jetpack Compose. It is created only for learning UI, state, and event handling.

📌 What this screen contains
Email input field
Password input field
Log In button
Loading indicator while login
🧠 Basic Idea
The UI works using State and Event.

State holds data (email, password, loading)
Event tells what the user did (typed email, clicked login)
UI only shows data, it does not store logic
🔄 Simple Flow
User types in Email field
Value goes to LoginEvent.EmailChanged
ViewModel updates state.email
UI automatically updates (recompose)
Same flow applies for password.

⏳ Loading State
When Log in button is clicked → isLoading = true
Button becomes disabled
Progress indicator is shown
After work is done → isLoading = false
📱 Responsiveness
This UI is responsive because:

fillMaxWidth() and fillMaxSize() are used
verticalScroll() allows scrolling on small screens
Layout adjusts automatically on different screen sizes
📂 Files Used
LoginScreenUi.kt → Main UI
LoginState.kt → Holds UI data
LoginEvent.kt → User actions
LoginViewModel.kt → Handles logic
🎯 Purpose
This screen is made to understand:

Jetpack Compose basics
State hoisting
Event handling
UI recomposition
👤 Author
Anil Chaudhary