package com.example.sellapy.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.navigation.ROUT_LOGIN
import com.example.sellapy.ui.theme.orange
import com.example.sellapy.ui.theme.red


//copy from the AboutScreen
@Composable
fun SignupScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
            .paint(painterResource(id = R.drawable.background1), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Spacer(modifier = Modifier.heightIn(30.dp))

        Image(
            painter = painterResource(id = R.drawable.signup1) ,  //R.examples.(the name of the app)
            contentDescription ="products",
            modifier = Modifier.size(150.dp)

        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Sellapy",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = red,

            )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Do not have an account?Create Account",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,


            )
        Spacer(modifier = Modifier.heightIn(10.dp))
        //textfields
        var name by remember { mutableStateOf("") } //create a var{name} to have a text field
        var email by remember { mutableStateOf("") } //create a var{name}
        var password by remember { mutableStateOf("") } //create a var{name}
        var confpassword by remember { mutableStateOf("") } //create a var{name}

        Spacer(modifier = Modifier.heightIn(10.dp))


        //textfield for name
        OutlinedTextField(
            value = name   ,
            onValueChange = { name = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = orange)},
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "FullName")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))

        Spacer(modifier = Modifier.heightIn(10.dp))

        //textfield for email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = orange)},
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "Email Address")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email))

        Spacer(modifier = Modifier.heightIn(10.dp))



        //textfield for password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = orange)},
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.heightIn(10.dp))


        //textfield for confpassword
        OutlinedTextField(
            value = confpassword,
            onValueChange = { confpassword = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = orange)},
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "ConfPassword")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.heightIn(10.dp))
        //copy them from screens.kt in MVVMFinal
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(
            onClick = {
                //copy the codes from MVVM final
                //corrensponds with  AuthviewModel.kt
                authViewModel.signup(name, email, password,confpassword)


            }, //it allows navigation to diffrent screens
            colors = ButtonDefaults.buttonColors(red),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Create an account"
            )

        }

            Text(
                text = "Already have an account?Login",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { ROUT_LOGIN }

            )



        }

}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}
//database Firebase authentication using a custom
//create a package in com.examples.sellapy (models and data)
//create a class by the name User
//copy the codes from MVVMFinal
//in build.gradle(app) change minsdk to 23