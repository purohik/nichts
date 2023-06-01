package com.purohik.nichts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CompleteScreen() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(172, 125, 255, 255))
    ) {
        RenderWord("paris")
    }
}

@Composable
fun RenderWord(word: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

    }
}