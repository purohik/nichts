package com.purohik.nichts

import androidx.compose.ui.graphics.Color

enum class LetterState {
    CORRECT, INCORRECT, NOT_PRESENT
}

val BUTTON_STATES = mapOf(
    LetterState.CORRECT to Color(186,255,201, 200),
    LetterState.INCORRECT to Color(255,255,156, 255),
    LetterState.NOT_PRESENT to Color(128, 139, 150, 255),
)