package com.example.androidsamplejetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidsamplejetpackcompose.components.autoSlider.AutoSliding
import com.example.androidsamplejetpackcompose.components.listItem.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.example.androidsamplejetpackcompose.R

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .background(color = Color.White)
    ) {
        item {
            AutoSliding()
        }

        item {
            ListHorizontal("Horizontal List", list = FakeData())
        }
        item {
            ListVertical("Vertical List", list = FakeData2())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}