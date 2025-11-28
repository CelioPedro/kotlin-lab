package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _root_ide_package_.com.example.myapplication.ui.theme.MyApplicationTheme {
                _root_ide_package_.com.example.myapplication.Greeting()
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val helloWorldText = "Hello World!"
    val welcomeText = "Bem-vindos a nossa primeira aplicação com kotlin no Android Studio"

    var textToDisplay by remember { mutableStateOf(helloWorldText) }
    val animatedLength = remember { Animatable(0f) }

    // Coroutine to orchestrate the animation sequence
    LaunchedEffect(Unit) {
        // Phase 1: Type "Hello World!"
        animatedLength.animateTo(
            targetValue = helloWorldText.length.toFloat(),
            animationSpec = tween(
                durationMillis = helloWorldText.length * 150, // Slower typing speed
                easing = LinearEasing
            )
        )

        // Pause after the first message
        delay(2000)

        // Phase 2: Untype "Hello World!"
        animatedLength.animateTo(
            targetValue = 0f,
            animationSpec = tween(
                durationMillis = helloWorldText.length * 75, // Faster un-typing
                easing = LinearEasing
            )
        )

        // Short pause before the next message
        delay(500)

        // Phase 3: Switch the text and type the new message
        textToDisplay = welcomeText
        animatedLength.animateTo(
            targetValue = welcomeText.length.toFloat(),
            animationSpec = tween(
                durationMillis = welcomeText.length * 100,
                easing = LinearEasing
            )
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = textToDisplay.take(animatedLength.value.toInt()),
            modifier = Modifier.padding(horizontal = 24.dp),
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _root_ide_package_.com.example.myapplication.ui.theme.MyApplicationTheme {
        _root_ide_package_.com.example.myapplication.Greeting()
    }
}
