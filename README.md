# EncryptedMessagingAndroidApp
Encrypted Messaging Android App using rsa cryptography to encrypt and decrypt messages.


Working Log:
8/4/2023, 1:56: I have added the work i have already done into the repository. Multiple java files inserted. One file for each page, and multiple assisting files. The current functionality is limited to 4 screens each with a button. The first screen contains a list of each contact that the user has. A button to add a contact takes the user to a create contact page where they are able to insert the name and the public key for the contact. Once completed, the user can click finish. Or if the user changes their mind, they can push the cancel button to return to the contact screen.
The application structure is below:
![image](https://github.com/nicholascallee/EncryptedMessagingAndroidApp/assets/141438641/6c2735c5-f544-4d4d-bac7-bd5dde5a9d2d)
This structure was setup with state hoisting in mind. I chose to do this because it lowers complexity and brings data changes to a single point of authority. so far i have implemented the contact details list. It currently does not store any data after the app closes and re-opens. My plan is to use roomdb which is a wrapper of an sql server. Here i will store the account info for each contact (name and public key).

Also uploading a powerpoint i have made to keep track of what needs done.

Current main screen:
![image](https://github.com/nicholascallee/EncryptedMessagingAndroidApp/assets/141438641/00b95b25-04f7-4124-83eb-f131992f0e4e)

