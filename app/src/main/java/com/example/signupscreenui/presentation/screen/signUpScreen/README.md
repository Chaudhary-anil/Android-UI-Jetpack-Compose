# Signup Screen UI (Jetpack Compose)

This is a simple Signup Screen UI made using Jetpack Compose.
It is created only for learning UI, state, and event handling.

---

## 📌 What this screen contains

- Email input field
- Password input field
- Sign Up button
- Loading indicator while submitting

---

## 🧠 Basic Idea

The UI works using **State** and **Event**.

- **State** holds data (email, password, loading)
- **Event** tells what the user did (typed email, clicked button)
- UI only shows data, it does not store logic

---

## 🔄 Simple Flow

1. User types in Email field
2. Value goes to `SignUpEvent.EmailChanged`
3. ViewModel updates `state.email`
4. UI automatically updates (recompose)

Same flow applies for password.

---

## ⏳ Loading State

- When Sign Up button is clicked → `isLoading = true`
- Button becomes disabled
- Progress indicator is shown
- After work is done → `isLoading = false`

---

## 📱 Responsiveness

This UI is responsive because:
- `fillMaxWidth()` and `fillMaxSize()` are used
- `verticalScroll()` allows scrolling on small screens
- Layout adjusts automatically on different screen sizes

---

## 📂 Files Used

- `SignUpScreenUi.kt` → Main UI
- `SignUpState.kt` → Holds UI data
- `SignUpEvent.kt` → User actions
- `SignUpViewModel.kt` → Handles logic

---

## 🎯 Purpose

This screen is made to understand:
- Jetpack Compose basics
- State hoisting
- Event handling
- UI recomposition

---

## 👤 Author

Anil Chaudhary
