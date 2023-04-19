package com.example.androidsamplejetpackcompose.components.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidsamplejetpackcompose.R
import com.example.androidsamplejetpackcompose.ui.theme.AndroidSampleJetpackComposeTheme

@Composable
fun SearchComponent() {
    var value by remember {
        mutableStateOf("")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_app),
            contentDescription = "logo app",
            modifier = Modifier.weight(2f)
        )
        TextField(
            value = value,
            onValueChange = { newText ->
                value = newText
            },
            placeholder = { Text(text = "Tìm kiếm") },
            modifier = Modifier.padding(10.dp)
                .border(1.dp, Color.Green, CircleShape).weight(4f),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
        Image(
            painter = painterResource(id = R.drawable.menu_24px),
            contentDescription = "menu",
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchComponentPreview(){
    AndroidSampleJetpackComposeTheme {
        SearchComponent()
    }
}
