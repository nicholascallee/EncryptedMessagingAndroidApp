package com.example.encryptedmessagingandroidapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.encryptedmessagingandroidapp.ui.theme.EncryptedMessagingAndroidAppTheme
import com.example.encryptedmessagingandroidapp.data.BottomNavigationScreens



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EncryptedMessagingAndroidAppTheme {
                val navController = rememberNavController()
                val bottomNavigationItems = listOf(
                    BottomNavigationScreens.home,
                    BottomNavigationScreens.details,
                    BottomNavigationScreens.encrypt,
                    BottomNavigationScreens.decrypt
                )
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            customTopBar()
                        },
                        bottomBar = {
                            customBottomBar(navController = navController, items = bottomNavigationItems )
                        }
                    )
                    { innerPadding ->
                        // Add padding to your content
                        Column(
                            Modifier.padding(innerPadding)
                        ){
                            customNavHost(navController = navController)
                        }
                    }
                }
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EncryptedMessagingAndroidAppTheme {
        EncryptedMessagingAndroidAppTheme {
            val navController = rememberNavController()
            val bottomNavigationItems = listOf(
                BottomNavigationScreens.home,
                BottomNavigationScreens.details,
                BottomNavigationScreens.encrypt,
                BottomNavigationScreens.decrypt
            )
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Scaffold(
                    bottomBar = {
                        customBottomBar(navController = navController, items = bottomNavigationItems )
                    },
                ) {
                    customNavHost(navController = navController)
                }
            }
        }
    }
}