package com.example.firtjetpack.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firtjetpack.ui.theme.FirtJetpackTheme

@Composable
fun SurfaceScreen() {
    var langs=listOf("Kotlin","JavaScript",
        "Python","C#","Assembler","C")
    Surface(modifier = Modifier.fillMaxSize(),
        contentColor = Color.LightGray,
        color = Color.DarkGray
    )
    {
        Column {
            Text("Языки программирования", fontSize = 28.sp)
            for (lang in langs)
                Text(lang, fontSize = 22.sp)
        }
    }
}
@Preview
@Composable
fun PreviewSurface(){
    FirtJetpackTheme(darkTheme = false) {
        SurfaceScreen()
    }
}