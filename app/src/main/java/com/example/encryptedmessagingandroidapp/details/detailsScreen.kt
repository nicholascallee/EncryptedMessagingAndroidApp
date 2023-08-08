package com.example.encryptedmessagingandroidapp.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.encryptedmessagingandroidapp.contacts.contactItem

@Composable
fun detailsScreen(
    onClickPage2ButtonForPage3: () -> Unit = {},
    modifier: Modifier = Modifier

) {

    Column{
        Box(modifier = modifier
            .padding(bottom = 70.dp, top = 10.dp, start = 10.dp, end = 10.dp)
            .fillMaxHeight()
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Green)
            .fillMaxWidth()
        ) {
            Column {
                Text(
                    text = "CONTACT NAME",
                    modifier = modifier
                )
                Text(
                    text = "CONTACT public key",
                    modifier = modifier
                )
                TextButton(
                    onClick = onClickPage2ButtonForPage3,
                    modifier = Modifier
                        .height(75.dp)
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                ) {
                    Text(
                        text = "encrypt",
                        modifier = modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Italic
                    )
                }
                TextButton(
                    onClick = onClickPage2ButtonForPage3,
                    modifier = Modifier
                        .height(75.dp)
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                ) {
                    Text(
                        text = "decrypt",
                        modifier = modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun prev(){
    detailsScreen(modifier = Modifier)
}