package com.example.sellapy.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.ui.theme.purple

//copy @composable from about package

@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize().background(purple),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.heightIn(30.dp))
        Image(
            painter = painterResource(id = R.drawable.adobe) ,  //R.examples.(the name of the app)
            contentDescription ="products",
            modifier = Modifier.size(150.dp)



        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Your Best Online Shop",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.Red,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )
        Spacer(modifier = Modifier.heightIn(30.dp))
        Column {
            Card (
                modifier = Modifier.fillMaxWidth().height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
            )
            {


            }


        }








    }



}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
