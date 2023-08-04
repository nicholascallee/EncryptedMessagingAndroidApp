package com.example.encryptedmessagingandroidapp.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun detailsScreen(
    onClickPage2ButtonForPage3: () -> Unit = {},
    modifier: Modifier = Modifier

) {
    TextButton(
        onClick = onClickPage2ButtonForPage3,
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .padding(top = 10.dp, start = 10.dp, end = 10.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Blue)
            .padding(15.dp)
    ) {
        Text(
            text = "page 2 content. click to go to page 3",
            modifier = modifier
        )
    }

}

@Preview
@Composable
fun prev(){
    detailsScreen(modifier = Modifier)
}