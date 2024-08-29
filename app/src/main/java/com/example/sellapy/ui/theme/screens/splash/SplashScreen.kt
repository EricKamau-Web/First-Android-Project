package com.example.sellapy.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.navigation.ROUT_LOGIN
import com.example.sellapy.ui.theme.orange
import com.example.sellapy.ui.theme.red
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// copy the about screen then routes and duplicate then update in appNavHost
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){

        //navigation code for a splashscreen

        val coroutine = rememberCoroutineScope()
        coroutine.launch {     // choose one with suppress
            delay(3000)
            navController.navigate(ROUT_LOGIN)
        }
        //end of navigation code
        //card 1
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
               Text(
                   text = "The home of Fashion",
                   fontSize = 30.sp,
                   color = Color.White,
                   fontFamily = FontFamily.Cursive
               )


           }

        }
            //end of card
        Text(
            text = "Koenigsegg Automotive AB is a Swedish manufacturer of high-performance sports cars based in Ängelholm, Skåne County, Sweden. Koenigsegg cars have on several occasions broken various production car speed records. Wikipedia",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Button(
            onClick = { navController.navigate(ROUT_DETAIL) }, //it allows navigation to different screens
            colors = ButtonDefaults.buttonColors(red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp)



        ) {
            Text(
                text = "Lets Begin"
            )

        }


    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
