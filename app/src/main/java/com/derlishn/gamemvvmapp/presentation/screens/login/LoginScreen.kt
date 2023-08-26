@file:OptIn(ExperimentalMaterial3Api::class)

package com.derlishn.gamemvvmapp.presentation.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.derlishn.gamemvvmapp.presentation.screens.login.components.LoginBottonBar
import com.derlishn.gamemvvmapp.presentation.screens.login.components.LoginContent
import com.derlishn.gamemvvmapp.presentation.ui.theme.GameMVVMAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen (){

    Scaffold(
        topBar = {},
        content = {
            LoginContent()
                  },
        bottomBar = {
            LoginBottonBar()
        }
    )

}

@Preview(
    showSystemUi = true,
    showBackground = true,
)
@Composable
fun LoginPreview() {
    GameMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen()
        }
    }
}