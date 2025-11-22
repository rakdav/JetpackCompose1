package com.example.firtjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firtjetpack.screens.InstagrameProfileCard
import com.example.firtjetpack.screens.PostCard
import com.example.firtjetpack.ui.theme.FirtJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirtJetpackTheme {
                Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PostCard()
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

@Composable
fun StoryCompose() {
    val langs = listOf(Language("Kotlin",0xff16a085),
        Language("Java",0xff2980b9),
        Language("JavaScript",0xffe74c3c),
        Language("Python", 0xffd35400))
    Column{
        for (lans in langs){
            Row(modifier = Modifier.padding(10.dp).fillMaxWidth()){
                Box(modifier = Modifier.size(50.dp).background((Color(lans.hexColor))))
                Text(text = lans.name, fontSize = 28.sp, modifier = Modifier.padding(10.dp))
            }
        }
    }
}

@Composable
fun StorySurface() {

}
data class Language(val name: String, val hexColor:Long)
@Preview(showBackground = true)
@Composable
fun HelloPreview(){
        StorySurface()
    }



