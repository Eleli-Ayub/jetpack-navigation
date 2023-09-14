package com.example.navigationjetpack.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpack.pages.HomePage
import com.example.navigationjetpack.pages.ProfilePage
import com.example.navigationjetpack.pages.auth.LoginPage
import com.example.navigationjetpack.pages.auth.RegisterPage

@Composable
fun AuthNavigation(navController: NavHostController) {

    NavHost(navController, startDestination = AuthScreen.LoginPage.route ){
        composable(route =AuthScreen.LoginPage.route ){
            LoginPage(navController = navController)
        }
        composable(route = AuthScreen.RegisterPage.route){
            RegisterPage(navController = navController)
        }
    }
}