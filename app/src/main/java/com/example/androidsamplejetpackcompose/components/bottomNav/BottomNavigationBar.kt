package com.example.androidsamplejetpackcompose.components.bottomNav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.androidsamplejetpackcompose.R

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Discovery,
        NavigationItem.Group,
        NavigationItem.Notification,
        NavigationItem.Rank,
        NavigationItem.Account,
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach {item->
                ItemMenuBottom(item = item, currentRoute = currentRoute, navController = navController)
            }
        }
    }
}

@Composable
fun ItemMenuBottom(
    item : NavigationItem,
    currentRoute : NavDestination?,
    navController: NavController
){
    val selected = currentRoute?.hierarchy?.any { it.route == item.route } == true
    val contentColor = if (selected) Color.Red else Color.Black
    
    Box(
        modifier = Modifier.padding(5.dp).clickable {
            navController.navigate(item.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(painter = painterResource(id = item.icon), contentDescription = "icon menu", tint = contentColor)
            Text(text = item.title, color = contentColor)
        }
    }
}
