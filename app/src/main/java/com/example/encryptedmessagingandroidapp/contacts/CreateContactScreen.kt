package com.example.encryptedmessagingandroidapp.contacts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateContactScreen (
    createContactName: String,
    createPubKey: String,
    onCreateContactNameChange: (String) -> Unit = {},
    onCreatePubKeyChange: (String) -> Unit = {},
    onClickCreateContact: () -> Unit = {},
    onCancel: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var localContactName by remember {
        mutableStateOf(createContactName)
    }
    var localPubKey by remember {
        mutableStateOf(createPubKey)
    }


    Column {

        Text(text = "Contact Name:", modifier = modifier.align(Alignment.CenterHorizontally))
        TextField(
            value =  localContactName,
            onValueChange = {
                            localContactName = it},
            modifier = modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(15.dp))
                .height(50.dp)
                .fillMaxWidth()
        )

        Text(text = "Contact Public Key:", modifier = modifier.align(Alignment.CenterHorizontally))

        TextField(
            value = localPubKey,
            onValueChange = {
                            localPubKey = it},
            modifier = modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(15.dp))
                .height(50.dp)
                .fillMaxWidth()
        )

        Button(
            onClick = {
                onCreatePubKeyChange(localPubKey)
                onCreateContactNameChange(localContactName)
                onClickCreateContact()
                      },
            modifier = modifier
                .fillMaxWidth()
                .height(75.dp)
                .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                .clip(RoundedCornerShape(15.dp)),
                colors = ButtonDefaults.outlinedButtonColors(Color.Green)
        ) {
            Text(text = "finish contact creation",
                modifier = Modifier)

        }


        Button(
            onClick = {
                onCancel()
            },
            modifier = modifier
                .fillMaxWidth()
                .height(75.dp)
                .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.outlinedButtonColors(Color.Red)
        ) {
            Text(text = "Cancel contact creation",
                modifier = Modifier
            )

        }
    }
}