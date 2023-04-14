package com.example.androidsamplejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.androidsamplejetpackcompose.components.bottomNav.BottomNavigationBar
import com.example.androidsamplejetpackcompose.components.bottomNav.Navigation
import com.example.androidsamplejetpackcompose.ui.theme.AndroidSampleJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidSampleJetpackComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) },
        backgroundColor = Color.White,
        content = { padding ->
            Box(modifier = Modifier.padding(padding)){
                Navigation(navController = navController)
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidSampleJetpackComposeTheme {
        MainScreen()
    }
}