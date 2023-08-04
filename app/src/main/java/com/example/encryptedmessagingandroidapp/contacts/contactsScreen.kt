package com.example.encryptedmessagingandroidapp.contacts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.encryptedmessagingandroidapp.data.Contact
import com.example.encryptedmessagingandroidapp.data.CustomContactList


@Composable
fun contactsScreen(
    onClickContactButton: () -> Unit,
    contactItemsList: CustomContactList,
    modifier: Modifier = Modifier,
    onClickCircleAddButton: () -> Unit
) {
    Column{
        Box(modifier = modifier
            .padding(bottom = 70.dp, top = 10.dp, start = 10.dp, end = 10.dp)
            .fillMaxHeight()
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Green)
            .fillMaxWidth()
        ) {
            LazyColumn() {
                items(contactItemsList.customContacts.size){
                    contactItem(onClickContactButton = onClickContactButton, modifier = Modifier, contact = contactItemsList.customContacts[it])
                }
            }

        }
    }
    circleAddButton(onClickCircleAddButton)
}

@Composable
fun circleAddButton(
    onClickCircleAddButton: () -> Unit = {},
){
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 90.dp, end = 40.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.End

    ) {
        Button(
            shape = CircleShape,
            onClick = onClickCircleAddButton,
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "test")
        }
    }
}






@Composable
fun contactItem(
    onClickContactButton: () -> Unit = {},
    modifier: Modifier,
    contact: Contact
){
    TextButton(
        onClick = onClickContactButton,
        modifier = Modifier
            .height(75.dp)
            .fillMaxWidth()
            .padding(top = 10.dp, start = 10.dp, end = 10.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)
    ) {
        Text(
            text = contact.name,
            modifier = modifier,
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic
        )
    }
}