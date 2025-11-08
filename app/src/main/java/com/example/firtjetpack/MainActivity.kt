package com.example.firtjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.firtjetpack.ui.theme.FirtJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirtJetpackTheme {
                Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NewStory()
                }
            }

        }
    }
}
@Composable
fun NewStory(){
    MaterialTheme {
        val typography=MaterialTheme.typography
        Column(
            modifier = Modifier.padding(top = 50.dp, start =  16.dp,
                bottom = 16.dp, end = 16.dp)
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.world),
                modifier = Modifier.height(180.dp).fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentDescription = "world",
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(16.dp))
            Text("A day in Shark Fin Cove", style = typography.headlineLarge)
            Text("Davenport, California", style = typography.headlineSmall)
            Text("December 2018", style = typography.headlineSmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloPreview(){
    FirtJetpackTheme {
        Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
            NewStory()
        }
    }
}


