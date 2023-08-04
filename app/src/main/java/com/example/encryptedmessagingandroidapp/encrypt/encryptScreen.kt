package com.example.encryptedmessagingandroidapp.encrypt

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
import androidx.compose.ui.unit.dp

@Composable
fun encryptScreen(
onClickPage3ButtonForPage1: () -> Unit = {},
modifier: Modifier = Modifier

) {
    TextButton(
        onClick = onClickPage3ButtonForPage1,
        modifier = Modifier.height(100.dp)
            .fillMaxWidth()
            .padding(top = 15.dp, start = 15.dp, end = 15.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Yellow)
            .padding(15.dp)
    ) {
        Text(
            text = "page 3 content. click to go to page 4",
            modifier = modifier
        )
    }
}
