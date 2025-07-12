package com.exerciciosapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exerciciosapp.model.Exercise

@Composable
fun ExerciseDetailScreen(exercise: Exercise, onStart: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Exercício: ${exercise.name}", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(exercise.instructions)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onStart) {
            Text("Iniciar exercício")
        }
    }
}
