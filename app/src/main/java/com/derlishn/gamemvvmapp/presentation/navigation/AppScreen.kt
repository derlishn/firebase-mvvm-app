package com.derlishn.gamemvvmapp.presentation.navigation

sealed class AppScreen(val route:String) {
    object Login: AppScreen("login")
    object Singup: AppScreen("singup")
}
