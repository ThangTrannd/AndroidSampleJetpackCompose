package com.example.androidsamplejetpackcompose.components.listItem

import com.example.androidsamplejetpackcompose.R
import com.example.androidsamplejetpackcompose.model.ItemDetail

fun FakeData(): List<ItemDetail> {
    val data = listOf(
        ItemDetail("Thumbnail 1", R.drawable.sample_thumbnail, "1000 view"),
        ItemDetail("Thumbnail 2", R.drawable.sample_thumbnail, "2000 view"),
        ItemDetail("Thumbnail 3", R.drawable.sample_thumbnail, "3000 view"),
        ItemDetail("Thumbnail 4", R.drawable.sample_thumbnail, "4000 view"),
        ItemDetail("Thumbnail 1", R.drawable.sample_thumbnail, "1000 view"),
        ItemDetail("Thumbnail 2", R.drawable.sample_thumbnail, "2000 view"),
        ItemDetail("Thumbnail 3", R.drawable.sample_thumbnail, "3000 view"),
        ItemDetail("Thumbnail 4", R.drawable.sample_thumbnail, "4000 view")
    )
    return data
}

fun FakeData2(): List<ItemDetail> {
    val data = listOf(
        ItemDetail("Thumbnail 1", R.drawable.sample_thumbnail, "1000 view"),
        ItemDetail("Thumbnail 2", R.drawable.sample_thumbnail, "2000 view"),
        ItemDetail("Thumbnail 3", R.drawable.sample_thumbnail, "3000 view"),
        ItemDetail("Thumbnail 4", R.drawable.sample_thumbnail, "4000 view")
    )
    return data
}