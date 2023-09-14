package com.example.navigationjetpack.components

sealed class Screen(val route: String){
    object Mainscreen: Screen("main_screen")
    object ProfileScreen: Screen("profile_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }
}

