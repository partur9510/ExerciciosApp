package com.exerciciosapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun CountdownScreen(onFinish: () -> Unit) {
    var timeLeft by remember { mutableStateOf(60) }

    LaunchedEffect(Unit) {
        while (timeLeft > 0) {
            delay(1000L)
            timeLeft--
        }
        onFinish()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (timeLeft > 0) {
            Text("$timeLeft segundos restantes", fontSize = 32.sp)
        } else {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Parabéns!", fontSize = 28.sp)
                Text("Você merece se refrescar 😎🍧", fontSize = 20.sp)
            }
        }
    }
}
