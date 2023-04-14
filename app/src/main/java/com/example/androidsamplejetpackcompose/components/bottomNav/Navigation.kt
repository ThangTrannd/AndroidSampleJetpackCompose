package com.example.androidsamplejetpackcompose.components.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidsamplejetpackcompose.screens.*

@Composable
fun Navigation(navController : NavHostController){
    NavHost(navController, startDestination = NavigationItem.Discovery.route){
        composable(NavigationItem.Discovery.route){
            DiscoveryScreen()
        }
        composable(NavigationItem.Group.route){
            GroupScreen()
        }
        composable(NavigationItem.Notification.route){
            NotificationScreen()
        }
        composable(NavigationItem.Rank.route){
            RankScreen()
        }
        composable(NavigationItem.Account.route){
            AccountScreen()
        }
    }
}