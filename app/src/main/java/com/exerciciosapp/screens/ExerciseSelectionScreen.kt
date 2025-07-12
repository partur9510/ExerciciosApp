package com.exerciciosapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exerciciosapp.model.Exercise

@Composable
fun ExerciseSelectionScreen(onSelect: (Exercise) -> Unit) {
    val exercises = listOf(
        Exercise("Polichinelo", "Fique em pé e salte abrindo pernas e braços."),
        Exercise("Agachamento", "Flexione os joelhos como se fosse sentar."),
        Exercise("Corrida parada", "Corra sem sair do lugar.")
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Escolha seu exercício", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        exercises.forEach { exercise ->
            Button(
                onClick = { onSelect(exercise) },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            ) {
                Text(exercise.name)
            }
        }
    }
}
