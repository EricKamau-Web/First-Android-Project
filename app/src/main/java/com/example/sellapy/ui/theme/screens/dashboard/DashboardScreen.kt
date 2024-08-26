package com.example.sellapy.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_HOME
import com.example.sellapy.ui.theme.orange
import com.example.sellapy.ui.theme.pink
import com.example.sellapy.ui.theme.purple
import com.example.sellapy.ui.theme.red

//copy @composable from about package

@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(orange),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.heightIn(30.dp))
        Image(
            painter = painterResource(id = R.drawable.logo2) ,  //R.examples.(the name of the app)
            contentDescription ="products",
            modifier = Modifier.size(150.dp)



        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        Text(
            text = "Your Best Online Shop",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )
        Spacer(modifier = Modifier.heightIn(30.dp))
        Column {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .clickable { navController.navigate(ROUT_DASHBOARD) },


                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(pink)
            )
            {
                //row1
                Row (modifier = Modifier.padding(20.dp)){
                    //card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.home) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 1
                    Spacer(modifier = Modifier.width(30.dp))


                    //card2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.profile) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 2






                }
                //end of row1
                //row2
                Row (modifier = Modifier.padding(20.dp)){
                    //card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.setting) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 1
                    Spacer(modifier = Modifier.width(30.dp))


                    //card2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chat) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 2






                }
                //end of row2
                //row3
                Row (modifier = Modifier.padding(20.dp)){
                    //card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.notification) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 1
                    Spacer(modifier = Modifier.width(30.dp))


                    //card2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.game) ,
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.heightIn(30.dp))






                    }
                    //end of card 2






                }
                //end of row3




            }


        }








    }



}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
