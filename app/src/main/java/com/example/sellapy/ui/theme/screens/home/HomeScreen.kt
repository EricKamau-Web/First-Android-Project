package com.example.sellapy.ui.theme.screens.home


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.orange
import com.example.sellapy.ui.theme.purple
import com.example.sellapy.ui.theme.red



@Composable
fun HomeScreen(navController:NavController){

    //BRACKETS ARE FOR STYLING
    //{}ARE FOR DISPLAY

    Column (
        modifier = Modifier.
        fillMaxSize()
        .background(purple),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){

        Image(
            painter = painterResource(id = R.drawable.adobe) ,  //R.examples.(the name of the app)
            contentDescription ="products",
            modifier = Modifier.size(150.dp)



        )
        Spacer(modifier = Modifier.heightIn(10.dp))

        Text(
            text = "Sellapy",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            color = red,

        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        
        Button(
            onClick = { navController.navigate(ROUT_DETAIL) }, //it allows navigation to diffrent screens
            colors = ButtonDefaults.buttonColors(red),
            shape = RoundedCornerShape(10.dp)



        ) {
            Text(
                text = "continue"
            )
            
        }







    }


}





@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    HomeScreen(navController = rememberNavController())

}