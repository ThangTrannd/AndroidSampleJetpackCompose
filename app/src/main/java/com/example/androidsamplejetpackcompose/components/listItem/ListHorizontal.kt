package com.example.androidsamplejetpackcompose.components.listItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidsamplejetpackcompose.model.ItemDetail

@Composable
fun ListHorizontal(list : List<ItemDetail>){
    LazyRow(modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 10.dp)){
        items(items = list, itemContent = {item ->
            ItemList(data = item)
        })
    }
}

@Composable
fun ItemList(data : ItemDetail){
    Box (modifier = Modifier.padding(end = 10.dp).width(150.dp).height(200.dp).clip(
        RoundedCornerShape(5.dp)
    )){
        Image(
            painter = painterResource(id = data.image),
            contentDescription = "image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier.align(Alignment.BottomStart).padding(5.dp)){
            Text(text = data.title, style = TextStyle(fontSize = 15.sp, color = Color.White))
            Text(text = data.view ,  style = TextStyle(fontSize = 15.sp, color = Color.White))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListHorizontalPreview(){
    ListHorizontal(list = FakeData())
}
