package com.exerciciosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exerciciosapp.model.Exercise
import com.exerciciosapp.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selectedExercise by remember { mutableStateOf<Exercise?>(null) }
            var screen by remember { mutableStateOf("selection") }

            when (screen) {
                "selection" -> ExerciseSelectionScreen {
                    selectedExercise = it
                    screen = "detail"
                }
                "detail" -> selectedExercise?.let {
                    ExerciseDetailScreen(exercise = it) {
                        screen = "countdown"
                    }
                }
                "countdown" -> CountdownScreen {
                    screen = "selection"
                }
            }
        }
    }
}
