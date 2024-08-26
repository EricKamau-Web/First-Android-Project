package com.example.sellapy.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.ui.theme.orange

// copy the about screen then routes and duplicate then update in appNavHost
@Composable
fun SplashScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        Card (modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
            shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
            colors = CardDefaults.cardColors(orange))
        {

           Column (
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier.fillMaxSize()
           ){
               Image(
                   painter = painterResource(id = R.drawable.logo) ,  //R.examples.(the name of the app)
                   contentDescription ="products",
                   modifier = Modifier.size(150.dp))
               Text(
                   text = "Welcome to Sellappy",
                   fontSize = 30.sp,
                   color = Color.White,
                   fontFamily = FontFamily.SansSerif
               )

           }

        }

    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
