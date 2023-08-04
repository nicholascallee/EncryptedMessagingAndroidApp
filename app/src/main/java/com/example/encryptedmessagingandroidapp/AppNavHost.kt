package com.example.encryptedmessagingandroidapp


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.encryptedmessagingandroidapp.contacts.CreateContactScreen
import com.example.encryptedmessagingandroidapp.data.Contact
import com.example.encryptedmessagingandroidapp.data.CustomContactList
import com.example.encryptedmessagingandroidapp.contacts.contactsScreen
import com.example.encryptedmessagingandroidapp.details.detailsScreen
import com.example.encryptedmessagingandroidapp.encrypt.encryptScreen
import com.example.encryptedmessagingandroidapp.decrypt.decryptScreen

@Composable
fun customNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    val  myCustomContactList by remember {
        mutableStateOf(CustomContactList(listOf(Contact("nick","pubkey123"))))
    }
    var createContactName by remember {
        mutableStateOf("")
    }
    var createPubKey by remember {
        mutableStateOf("")
    }
    fun changeContactName(name: String){
        createContactName = name
    }
    fun changePubKey(key: String){
        createPubKey = key
    }

    NavHost(
        navController = navController,
        startDestination = "contacts",
        modifier = modifier
    ){

        composable(route = "contacts") {
            contactsScreen(
                contactItemsList = myCustomContactList,
                onClickContactButton = { navController.navigateSingleTopTo("details") },
                modifier = modifier,
                onClickCircleAddButton = { navController.navigateSingleTopTo("createContact") }
            )
        }
        composable(route = "details") {
            detailsScreen(
                { navController.navigateSingleTopTo("encrypt") }
            )
        }
        composable(route = "encrypt") {
           encryptScreen(
               { navController.navigateSingleTopTo("decrypt") }
           )
        }
        composable(route = "decrypt") {
            decryptScreen(
                { navController.navigateSingleTopTo("contacts") }
            )
        }
        composable(route = "createContact") {
            CreateContactScreen(
                createContactName,
                createPubKey,
                onCreateContactNameChange = ::changeContactName,
                onCreatePubKeyChange = ::changePubKey,
                modifier = modifier,
                onClickCreateContact = { myCustomContactList.addContact(createContactName,createPubKey)
                    createContactName = ""
                    createPubKey = ""
                    navController.navigateSingleTopTo("contacts")
                },
                onCancel = {
                    createContactName = ""
                    createPubKey = ""
                    navController.navigateSingleTopTo("contacts")}
                )
        }
    }

}




fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }