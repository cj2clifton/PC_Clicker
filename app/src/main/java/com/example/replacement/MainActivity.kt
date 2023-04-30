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
import androidx.compose.ui.unit.sp
import com.example.replacement.ui.theme.ReplacementTheme
import com.example.replacement.ui.theme.black432
import com.example.replacement.ui.theme.red564

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReplacementTheme {
                Box(modifier = Modifier.fillMaxWidth(1F)
                    .fillMaxHeight(1F))
                //Modifier.requiredSize(size:5.dp))
                {
                    var score: MutableState<Int> = remember { mutableStateOf(0) }
                    Column {
                        Text(text = "${score.value}", color = black432)
                        Button(onClick = { score.value++ }
                        ) {
                            Text(text = "Click Me", fontSize = 50.sp, color =  black432)
                            Modifier.fillMaxWidth(1F)
                                .fillMaxHeight(0.5F)
                                .padding(50.dp)
                        }
                    }
                }
                }
                }
            }
        }


