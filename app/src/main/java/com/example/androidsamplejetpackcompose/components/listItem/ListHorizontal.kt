package com.example.androidsamplejetpackcompose.components.listItem

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListHorizontal(var list : List<T>){
    LazyRow(){
        items(items = list)
    }
}

@Preview(showBackground = true)
@Composable
fun ListHorizontalPreview(){

}
