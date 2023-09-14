package com.example.navigationjetpack.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.navigationjetpack.pages.HomePage
import com.example.navigationjetpack.pages.ProfilePage
import com.example.navigationjetpack.pages.auth.LoginPage
import com.example.navigationjetpack.pages.auth.RegisterPage

@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Mainscreen.route ){
        composable(route = Screen.Mainscreen.route){
            HomePage(navController = navController)
        }
        navigation(
            route = "auth",
            startDestination = AuthScreen.LoginPage.route
        ) {
            composable(route = AuthScreen.LoginPage.route) {
                LoginPage(navController = navController)
            }
            composable(route = AuthScreen.RegisterPage.route) {
                RegisterPage(navController = navController)
            }
        }
        composable(route = Screen.ProfileScreen.route + "/{name}", arguments = listOf(
            navArgument("name"){
                type = NavType.StringType
                defaultValue = "John Does"
                nullable = true
            }
        )){entry->
            ProfilePage(navController = navController, name = entry.arguments?.getString("name"))
        }
    }


}