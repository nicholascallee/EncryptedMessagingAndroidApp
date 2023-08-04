package com.example.encryptedmessagingandroidapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String,val icon: ImageVector) {
    object home : BottomNavigationScreens("contacts", Icons.Default.Person)
    object details : BottomNavigationScreens("details", Icons.Default.Info)
    object encrypt : BottomNavigationScreens("encrypt", Icons.Default.Create)
    object decrypt : BottomNavigationScreens("decrypt", Icons.Default.Refresh)
}

