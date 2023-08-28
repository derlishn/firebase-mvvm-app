package com.derlishn.gamemvvmapp.presentation.screens.singUp

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.derlishn.gamemvvmapp.presentation.components.DefaultTopBar
import com.derlishn.gamemvvmapp.presentation.screens.singUp.components.SingupContent
import com.derlishn.gamemvvmapp.presentation.ui.theme.GameMVVMAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SingupScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Nuevo Usuario",
                upAvailable = true,
                navController = navController
            )
        },
        content = {
                  SingupContent()
        },
        bottomBar = {}
    )

}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PreviewSingupScreen() {
    GameMVVMAppTheme(darkTheme = true) {
        SingupScreen(rememberNavController())
    }
}