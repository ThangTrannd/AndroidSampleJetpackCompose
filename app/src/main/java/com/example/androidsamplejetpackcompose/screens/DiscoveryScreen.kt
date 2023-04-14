package com.example.androidsamplejetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidsamplejetpackcompose.components.autoSlider.AutoSliding
import com.example.androidsamplejetpackcompose.components.search.SearchComponent
import com.example.androidsamplejetpackcompose.components.tabLayout.TabLayout
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DiscoveryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .wrapContentSize(Center)
    ) {
        SearchComponent()
        TabLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun DiscoveryScreenPreview() {
    DiscoveryScreen()
}