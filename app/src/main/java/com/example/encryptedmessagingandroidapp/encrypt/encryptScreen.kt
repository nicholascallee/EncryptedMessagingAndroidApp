package com.example.encryptedmessagingandroidapp.encrypt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.encryptedmessagingandroidapp.data.Contact
import com.example.encryptedmessagingandroidapp.data.CustomContactList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun encryptScreen(
onClickPage3ButtonForPage1: () -> Unit = {},
modifier: Modifier = Modifier,

) {
    var  txtBoxVal by remember {
        mutableStateOf("write message here")
    }
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
                TextField(
                    modifier = Modifier
                        .height(80.dp),
                    value = txtBoxVal,
                    onValueChange = {txtBoxVal = it},
                    maxLines = Int.MAX_VALUE
                )
                TextButton(
                    onClick = onClickPage3ButtonForPage1,
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
            }
        }
    }
}
