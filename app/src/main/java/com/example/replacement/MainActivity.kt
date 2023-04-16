package com.example.replacement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.replacement.ui.theme.ReplacementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReplacementTheme {
                Surface(Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Text("test", color = MaterialTheme.colors.primary)
                    
                }
                }
            }
        }
    }

