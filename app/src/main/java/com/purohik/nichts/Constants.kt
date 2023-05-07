package com.purohik.nichts

import androidx.compose.ui.graphics.Color

enum class LetterState {
    CORRECT, INCORRECT, NOT_PRESENT
}

val BUTTON_STATES = mapOf(
    LetterState.CORRECT to Color.Green,
    LetterState.INCORRECT to Color.Yellow,
    LetterState.NOT_PRESENT to Color.Gray,
)