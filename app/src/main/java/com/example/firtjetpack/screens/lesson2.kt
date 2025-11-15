package com.example.firtjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowContainer() {
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Box(modifier = Modifier.background(Color.Red).
        height(150.dp).width(100.dp).weight(1f))
        Box(modifier = Modifier.background(Color.DarkGray).
        height(150.dp).width(100.dp).weight(1f))
        Box(modifier = Modifier.background(Color.Blue).
        height(150.dp).width(100.dp).weight(1f))
    }
}

@Composable
fun ColumnContainer(){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp))
    {
//        Text("Kotlin", fontSize = 28.sp)
//        Text("Java", fontSize = 28.sp)
//        Text("JavaScript", fontSize = 28.sp)
//        Text("Python", fontSize = 28.sp)
        Column(modifier = Modifier.fillMaxSize().
        border(width =2.dp, color = Color.Black),
            ) {
            Box(
                modifier = Modifier.background(Color.White).fillMaxWidth()
                    .height(100.dp).weight(1f)
            )
            Box(
                modifier = Modifier.background(Color.Blue).fillMaxWidth()
                    .height(100.dp).weight(1f)
            )
            Box(
                modifier = Modifier.background(Color.Red).fillMaxWidth()
                    .height(100.dp).weight(1f)
            )
        }
    }
}


@Composable
fun BoxContainer(){
    Box(modifier = Modifier.fillMaxSize().
    background(Color.Blue),
        contentAlignment = Alignment.Center)
    {
//        Box(modifier = Modifier.background(Color.DarkGray).size(220.dp))
//        Box(modifier = Modifier.background(Color.Red).size(200.dp))
//        Text("Hello, world!", fontSize = 28.sp)
        Box(modifier = Modifier.align(Alignment.TopStart).
        size(100.dp).background(Color.Red))
        Box(modifier = Modifier.align(Alignment.TopEnd).
        size(100.dp).background(Color.Green))
        Box(modifier = Modifier.align(Alignment.Center).
        size(100.dp).background(Color.Gray))
        Box(modifier = Modifier.align(Alignment.BottomStart).
        size(100.dp).background(Color.Yellow))
        Box(modifier = Modifier.align(Alignment.BottomEnd).
        size(100.dp).background(Color.Black))
    }
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
   // BoxContainer()
    //ColumnContainer()
    RowContainer()
}