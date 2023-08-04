package com.example.encryptedmessagingandroidapp.data

import com.example.encryptedmessagingandroidapp.data.Contact

class CustomContactList constructor(customContactList: List<Contact>){
    var customContacts =  customContactList


    fun addContact(name: String, pubKey: String){
        customContacts = customContacts.plus(Contact(name,pubKey))
    }
}