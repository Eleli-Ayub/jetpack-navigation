package com.example.navigationjetpack.pages.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navigationjetpack.components.AuthScreen
import com.example.navigationjetpack.components.Screen

@Composable
fun RegisterPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally

    ) {
        Text(text = "Register Page")

        Button(onClick = {
            navController.navigate(Screen.Mainscreen.route)
        }) {
            Text(text = "Home")
        }
        Button(onClick = {
            navController.navigate(Screen.ProfileScreen.withArgs("Registered"))
        }) {
            Text(text = "Profile")
        }
        Button(onClick = {
            navController.navigate(AuthScreen.LoginPage.route)
        }) {
            Text(text = "Login")
        }
    }
}