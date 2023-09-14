package com.example.navigationjetpack.components

sealed class AuthScreen(val route: String){
    object LoginPage: AuthScreen(route = "login_page")
    object RegisterPage: AuthScreen(route = "register_page")
}
