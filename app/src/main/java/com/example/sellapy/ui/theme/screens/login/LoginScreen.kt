package com.example.sellapy.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ROUT_SIGNUP
import com.example.sellapy.ui.theme.orange
import com.example.sellapy.ui.theme.red

@Composable
fun LoginScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            //adding a background image
            .paint(painterResource(id = R.drawable.background2), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier = Modifier.heightIn(10.dp))
        Image(
            painter = painterResource(id = R.drawable.shopping) ,  //R.examples.(the name of the app)
            contentDescription ="products",
            modifier = Modifier.size(150.dp)

        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Welcome Back!",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = red,

            )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Already have an account an account? Please enter your credentials",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
            )
        var email by remember { mutableStateOf("") } //create a var{name}
        var password by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.heightIn(10.dp))

        //textfield for name
        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = orange) },
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "Email Address")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.heightIn(10.dp))



        //textfield for name
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = orange) },
            //leading icon at the beginning   trailing icon at the end
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Row {
            Button(
                onClick = { authViewModel.login(email, password) }, //it allows navigation to diffrent screens
                colors = ButtonDefaults.buttonColors(red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Login as a User"
                )

            }
            Spacer(modifier = Modifier.width(30.dp))

            Button(
                onClick = { authViewModel.adminlogin(email, password)}, //it allows navigation to diffrent screens
                colors = ButtonDefaults.buttonColors(red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Login as an Admin"
                )

            }
        }
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Do not have an account? Register",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_SIGNUP)
            }


            )


    }



}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}
