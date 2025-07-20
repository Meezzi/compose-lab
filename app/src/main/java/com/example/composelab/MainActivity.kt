package com.example.composelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composelab.ui.layout.MySootheAppPortrait
import com.example.composelab.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLabTheme {
//                BasicsScreen(modifier = Modifier.fillMaxSize())
                MySootheAppPortrait()
            }
        }
    }
}