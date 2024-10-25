package com.example.aluchat.Nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aluchat.screens.ProfilePage
import com.example.aluchat.screens.SignInScreen

@Composable
fun nav(){


    val navControler= rememberNavController()
    NavHost(navController = navControler, startDestination = "Signing") {

        composable("Signing"){
            SignInScreen(navControler)
        }
        composable("ProfilePage") {
            ProfilePage(navControler)
        }
    }
}


