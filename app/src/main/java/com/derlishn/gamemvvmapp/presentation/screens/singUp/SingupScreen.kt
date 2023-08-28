package com.derlishn.gamemvvmapp.presentation.screens.singUp

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SingupScreen() {

    Scaffold(
        topBar = {},
        content = {
                  Text(text = "Registro")
        },
        bottomBar = {}
    )

}