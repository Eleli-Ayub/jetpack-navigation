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
import com.example.navigationjetpack.components.Screen

@Composable
fun HomePage(navController: NavController) {
    Column(

        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally

    ) {
        Text(text = "Homepage")

        Button(onClick = {
            navController.navigate(Screen.ProfileScreen.withArgs("Eleli Ayub"))
        }) {
            Text(text = "To profile page")
        }
    }
}