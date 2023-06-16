package com.example.androidsamplejetpackcompose.components.listItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidsamplejetpackcompose.model.ItemDetail

@Composable
fun ListVertical(title: String, list: List<ItemDetail>) {
    Column {
        Text(
            text = title,
            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp),
            style = TextStyle(fontSize = 20.sp)
        )
        LazyColumn(modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 10.dp)){
            items(items = list, itemContent = {item ->
                ItemListHorizontal(data = item)
            })
        }
    }
}

@Composable
fun ItemListVertical(data : ItemDetail){
    Box(modifier = Modifier
        .padding(bottom = 10.dp)
        .fillMaxWidth()
        .height(150.dp)
        .clip(
            RoundedCornerShape(5.dp)
        )){
        Image(painter = painterResource(id = data.image), contentDescription = "image",
        contentScale = ContentScale.FillBounds)
    }
}