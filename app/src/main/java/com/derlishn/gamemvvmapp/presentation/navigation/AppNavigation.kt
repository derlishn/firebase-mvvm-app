package com.derlishn.gamemvvmapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.derlishn.gamemvvmapp.presentation.screens.login.LoginScreen
import com.derlishn.gamemvvmapp.presentation.screens.singUp.SingupScreen

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination =  AppScreen.Login.route
    ) {
        composable(route = AppScreen.Login.route) {
            LoginScreen(navController)
        }
        composable(route = AppScreen.Singup.route) {
            SingupScreen()
        }
    }

}