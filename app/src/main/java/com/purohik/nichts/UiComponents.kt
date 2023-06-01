package com.purohik.nichts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.purohik.nichts.LetterState.CORRECT
import com.purohik.nichts.LetterState.INCORRECT
import com.purohik.nichts.LetterState.NOT_PRESENT

@Composable
fun CompleteScreen() {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxSize()
      .background(color = Color(172, 125, 255, 200))
  ) {
    RenderWord("paris")
  }
}

@Composable
fun RenderWord(word: String) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.background(
      color = Color(255, 50, 50, 100)
    )
  ) {
    for (letter in word) {
      var letterState by remember {
        mutableStateOf(NOT_PRESENT)
      }
      Button(
        onClick = {
          letterState = when (letterState) {
            CORRECT -> INCORRECT
            INCORRECT -> NOT_PRESENT
            NOT_PRESENT -> CORRECT
          }
        },
        colors = ButtonDefaults.buttonColors(
          containerColor = BUTTON_STATES[letterState]!!
        )
      ) {
        Text(text = letter.toString())
      }
    }
  }
}