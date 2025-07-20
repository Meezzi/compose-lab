package com.example.composelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import com.example.composelab.ui.basics.BasicsScreen
import com.example.composelab.ui.layout.MySootheApp
import com.example.composelab.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLabTheme {
                val windowSizeClass = calculateWindowSizeClass(this)
//                BasicsScreen(modifier = Modifier.fillMaxSize())
                MySootheApp(windowSizeClass)
            }
        }
    }
}