package com.example.androidsamplejetpackcompose.components.listItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidsamplejetpackcompose.R

@Composable
fun ListCombine() {

}

@Composable
fun GroupCombine() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.weight(1f)) {
            ItemNormal(modifier = Modifier)
            ItemNormal(modifier = Modifier)
        }
        ItemNormal(modifier = Modifier.weight(1f))
    }
}

@Composable
fun ItemNormal(modifier: Modifier) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.sample_thumbnail),
            contentDescription = "thumbnail",
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier) {
            Text(text = "idol hot girls", style = TextStyle(fontSize = 15.sp))
            Box(
                modifier = Modifier
                    .align(CenterHorizontally)
            ) {
                Row(
                    verticalAlignment = CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.person_24px_black),
                        contentDescription = "avatar"
                    )
                    Text(text = "1000 view", style = TextStyle(color = Color.Gray))
                }
                Text(
                    text = "Tag",
                    modifier = Modifier.align(Alignment.CenterEnd),
                    style = TextStyle(color = Color.Gray)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListCombineReview() {
    GroupCombine()
}