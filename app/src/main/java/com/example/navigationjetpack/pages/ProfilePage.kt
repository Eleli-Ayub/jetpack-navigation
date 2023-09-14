package com.example.navigationjetpack.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.navigationjetpack.components.AuthScreen
import com.example.navigationjetpack.components.Screen

@Composable
fun ProfilePage(navController: NavController, name: String?) {

    Column(

        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally

    ) {
    Text(text = "Username: $name")
    Text(text = "Profile Page")

    Button(onClick = {
        navController.navigate(Screen.Mainscreen.route)
    }) {
        Text(text = "Home")
    }
        Button(onClick = {
            navController.navigate(AuthScreen.RegisterPage.route)
    }) {
        Text(text = "Register")
    }
        Button(onClick = {
            navController.navigate(AuthScreen.LoginPage.route)
        }) {
        Text(text = "Login")
    }
}
}