package com.example.firtjetpack.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firtjetpack.R
import com.example.firtjetpack.ui.theme.FirtJetpackTheme

@Composable
fun InstagrameProfileCard(){
    Card(modifier = Modifier.padding(8.dp).
    background(MaterialTheme.colorScheme.background).
    border(BorderStroke(1.dp,MaterialTheme.colorScheme.background)),
        shape = RoundedCornerShape(topStart = 4.dp,
            topEnd = 4.dp)
        )
    {
        Column(modifier = Modifier.padding(16.dp))
        {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
            {
                Image(
                    painter = painterResource(id=R.drawable.ic_instagram),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp).clip(CircleShape).
                    background(Color.White).padding(8.dp)
                )
                UserStatistics(title = "Posts", value = "6,950")
                UserStatistics(title = "Followers", value = "436M")
                UserStatistics(title = "Following", value = "76")
            }
            Text(text = "Instagram", fontSize = 32.sp,
                fontFamily = FontFamily.Cursive)
            Text(text = "#YoursToMake", fontSize = 14.sp)
            Text(text = "www.facebook.com/emotional_health", fontSize = 14.sp)
            Button(onClick = {}, shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2196F3)
                )) {Text(text = "Follow") }

        }
    }
}
@Composable
private fun UserStatistics(title: String,value: String)
{
    Column(modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly)
    {
        Text(text = value, fontSize = 24.sp, fontFamily = FontFamily.Cursive)
        Text(text = title, fontWeight = FontWeight.Bold)
    }
}
@Preview
@Composable
fun PreviewCardLight(){
    FirtJetpackTheme(darkTheme = false) {
        InstagrameProfileCard()
    }
}
@Preview
@Composable
fun PreviewCardDark(){
    FirtJetpackTheme(darkTheme = true) {
        InstagrameProfileCard()
    }
}