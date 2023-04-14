package com.example.androidsamplejetpackcompose.components.listItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidsamplejetpackcompose.model.ItemDetail

@Composable
fun ListHorizontal(list : List<String>){
    LazyRow(){
        items(items = list, itemContent = {item ->
            when(item){
                "A" -> {

                }
                "B" -> {

                }
                "C" -> {

                }
                "D" -> {

                }
                else -> {

                }
            }
        })
    }
}

@Composable
fun ItemList(data : ItemDetail){
    Box {
        Image(painter = painterResource(id = data.image), contentDescription = "image")
    }
}

@Preview(showBackground = true)
@Composable
fun ListHorizontalPreview(){

}
