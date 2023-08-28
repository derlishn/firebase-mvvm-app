@file:OptIn(ExperimentalMaterial3Api::class)

package com.derlishn.gamemvvmapp.presentation.screens.login

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.derlishn.gamemvvmapp.presentation.screens.login.components.LoginBottonBar
import com.derlishn.gamemvvmapp.presentation.screens.login.components.LoginContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen (navController: NavHostController){

    Scaffold(
        topBar = {},
        content = {
            LoginContent()
                  },
        bottomBar = {
            LoginBottonBar(navController)
        }
    )

}