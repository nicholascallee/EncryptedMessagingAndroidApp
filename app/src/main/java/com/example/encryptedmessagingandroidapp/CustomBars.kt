package com.example.encryptedmessagingandroidapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.encryptedmessagingandroidapp.data.BottomNavigationScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun customTopBar() {
        CenterAlignedTopAppBar(
            title = {
                    Text(text = "Nicholas Christopher Allee's RSA Messager.")
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.Green.copy(alpha = 0.3f)
            )
        )
}
@Composable
fun customBottomBar(navController: NavController, items: List<BottomNavigationScreens>){
        BottomNavigation {
            val currentRoute = currentRoute(navController as NavHostController)
            items.forEach { screen ->
                BottomNavigationItem(
                    icon = { Icon(imageVector =screen.icon, contentDescription = "test") },
                    label = { Text(screen.route) },
                    selected = currentRoute == screen.route,
                    alwaysShowLabel = false,
                    onClick = {
                        // This if check gives us a "singleTop" behavior where we do not create a
                        // second instance of the composable if we are already on that destination
                        if (currentRoute != screen.route) {
                            navController.navigate(screen.route)
                        }
                    }
                )
            }

        }
    }

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}
