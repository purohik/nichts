package com.purohik.nichts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.purohik.nichts.ui.theme.NichtsTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      NichtsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          Nichts("World")
        }
      }
    }
  }
}

// TODO: remove this function since not used anywhere.
@Composable
fun Nichts(name: String, modifier: Modifier = Modifier) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = modifier
  ) {
    Column(
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Text(
        text = "Hello Android!",
        fontSize = 30.sp,
        fontWeight = FontWeight.Light,
      )
      Text(
        text = name,
        fontSize = 30.sp,
        fontWeight = FontWeight.Light,
      )
      Text(
        text = "My name is banana@",
        fontSize = 30.sp,
        fontWeight = FontWeight.Light,
      )
    }
  }
}

@Composable
fun FullScreen(word: String) {
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)
        .background(Color.Cyan)
  ) {
    Row {
      Text(
        text = "You should try..."
      )
    }
    Row {
      SuggestedWord(word = "krishna")
    }
    Row {
      Text(
        text = "Input the result..."
      )
    }
    InputWord(word = "kekws")
  }
}

@Composable
fun SuggestedWord(word: String) {
  Row {
    for (letter in word) {
      Text(text = letter.toString())
    }
  }
}

@Composable
fun InputWord(word: String) {
  Row {
    for (letter in word) {
      var letterState by remember {
        mutableStateOf(LetterState.CORRECT)
      }
      Button(
        onClick = {
          letterState = when (letterState) {
            LetterState.CORRECT -> LetterState.INCORRECT
            LetterState.INCORRECT -> LetterState.NOT_PRESENT
            LetterState.NOT_PRESENT -> LetterState.CORRECT
          }
        },
        colors = ButtonDefaults.buttonColors(
          containerColor = BUTTON_STATES[letterState]!!
        )
      ) {
        Text(
          text = letter.toString(),
        )
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun NichtsPreview() {
  NichtsTheme {
//        FullScreen("banana")
    CompleteScreen()
  }
}