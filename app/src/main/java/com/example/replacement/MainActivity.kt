package com.example.replacement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.material.Button
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.replacement.ui.theme.ReplacementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReplacementTheme {
                Box(modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight())
                //Modifier.requiredSize(size:5.dp))
                {
                    var score: MutableState<Int> = remember { mutableStateOf(0) }
                    Column {
                        Text(text = "${score.value}")
                        Button(onClick = { score.value++ }
                        ) {
                            Text(text = "Click Me")
                            Modifier
                                .padding(50.dp)
                        }
                    }
                }
                }
                }
            }
        }


