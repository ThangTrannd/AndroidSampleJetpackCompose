package com.example.androidsamplejetpackcompose.components.tabLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidsamplejetpackcompose.screens.*
import com.example.androidsamplejetpackcompose.ui.theme.AndroidSampleJetpackComposeTheme
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabLayout() {
    val pagerState = rememberPagerState(pageCount = 6)

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Tabs(pagerState = pagerState)
            }
        }
        TabContent(pagerState = pagerState)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(pagerState: PagerState) {
    val list = listOf("Home", "Thể thao", "Game", "Giải đấu", "Esport", "Giải trí")
    val scope = rememberCoroutineScope()

    TabRow(
        modifier = Modifier.fillMaxHeight(),
        selectedTabIndex = pagerState.currentPage,
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = Color.Cyan
            )
        }
    ) {
        list.forEachIndexed { index, _ ->
            Tab(
                modifier = Modifier.background(Color.White),
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
            ){
                Column(
                    Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        color = if (pagerState.currentPage == index) Color.Red else Color.Black,
                        text = list[index],
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContent(pagerState: PagerState) {
    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> HomeScreen()
            1 -> SportScreen()
            2 -> GameScreen()
            3 -> TournamentsScreen()
            4 -> EsportScreen()
            5 -> EntertainmentScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabLayoutPreview() {
    AndroidSampleJetpackComposeTheme {
        TabLayout()
    }
}