package com.example.firtjetpack.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firtjetpack.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.res.stringResource
import com.example.firtjetpack.ui.theme.FirtJetpackTheme

@Composable
fun PostCard() {
    Card(modifier = Modifier.padding(8.dp))
    {
        PostHeader()
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(R.string.template_text))
        Spacer(modifier = Modifier.height(8.dp))
        Image(modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id= R.drawable.images),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(8.dp))
        Statistic()
    }
}
@Composable
private fun PostHeader(){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically)
    {
        Image(modifier = Modifier.size(50.dp).clip(CircleShape),
            painter = painterResource(id=R.drawable.masha),
            contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f))
        {
            Text(text = "Уволено",
                color = MaterialTheme.colorScheme.onPrimary)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "14.00",color=MaterialTheme.colorScheme.onSecondary)
        }
        Icon(imageVector =Icons.Default.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondary)
    }
}

@Composable
private fun Statistic(){
    Row{
        Row(modifier = Modifier.weight(1f)){
            IconWithText(iconResId = R.drawable.ic_views_count,"206")
        }
        Row(modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween) {
            IconWithText(iconResId = R.drawable.ic_share,"206")
            IconWithText(iconResId = R.drawable.ic_comment,"11")
            IconWithText(iconResId = R.drawable.ic_like,"491")
        }
    }

}
@Composable
private fun IconWithText(iconResId:Int,text: String){
    Row(verticalAlignment = Alignment.CenterVertically){
        Icon(painter = painterResource(id=iconResId),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondary)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = text, color = MaterialTheme.colorScheme.onSecondary)
    }
}
@Preview
@Composable
fun PreviewPostCardLight(){
    FirtJetpackTheme(darkTheme = false) {
        PostCard()
    }
}
@Preview
@Composable
fun PreviewPostCardDark(){
    FirtJetpackTheme(darkTheme = true) {
        PostCard()
    }
}
