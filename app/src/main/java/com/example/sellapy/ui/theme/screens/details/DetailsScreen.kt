package com.example.sellapy.ui.theme.screens.details

import android.content.Intent
import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Sellappy", color = androidx.compose.ui.graphics.Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = androidx.compose.ui.graphics.Color.White)
                }
            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Menu", tint = androidx.compose.ui.graphics.Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Menu", tint = androidx.compose.ui.graphics.Color.White)
                }
            }

        )
        //End of TopAppBar
        Spacer(modifier = Modifier.heightIn(10.dp)) //space between topbar and searchbar



        //SearchBar

        var search by remember{ mutableStateOf("") }

        OutlinedTextField(
            value =search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp), //padding with the start
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = { Text(text = "Browse your products....")}
        )
        //End of Searchbar
        Spacer(modifier = Modifier.heightIn(10.dp)) //space between topbar and searchbar

        //image
       Box (modifier = Modifier
           .fillMaxWidth()
           .height(250.dp), contentAlignment = Alignment.Center){
           Image(painter = painterResource(id = R.drawable.clothe),
               contentDescription = "",
               modifier = Modifier.fillMaxSize(),
               contentScale = ContentScale.Crop
           )
           //Icon
           Icon(imageVector = Icons.Default.Favorite,
               contentDescription = "favorite",
               modifier = Modifier
                   .align(Alignment.TopEnd)
                   .padding(20.dp), //padding with all
               tint = androidx.compose.ui.graphics.Color.Red


           )
           Text(
               text = "Your best online shop",
               fontSize = 30.sp,
               color = androidx.compose.ui.graphics.Color.White,
               fontWeight = FontWeight.ExtraBold
           )

       }
        //End of image
        Spacer(modifier = Modifier.heightIn(10.dp))
        //text code(more products)

        Text(
            text = "More Products",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.Blue,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )
        Spacer(modifier = Modifier.heightIn(10.dp))
        //Row1  (displayed horizontally/side by side)

        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            Spacer(modifier = Modifier.width(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.cloth2),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))

            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.boy1),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.girl1),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.boy2),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.girl2),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.boy3),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card

        }
        //end of row1
        Spacer(modifier = Modifier.heightIn(10.dp))

        Text(
            text = "Additional Information",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.Blue,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )
        //column is vertical
        //row is horizontal/side by side
        Row {
            Spacer(modifier = Modifier.heightIn(10.dp))
            //card 1 codes
            //card with brackets and {}
            Card(modifier = Modifier
                .height(160.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(painter =
                    painterResource(id = R.drawable.dress),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )

                }

            }
            //end of card
            Spacer(modifier = Modifier.width(30.dp))
            val mContext = LocalContext.current //import the mContext function from the intent screen to elliminate the errors same case to the others(sms,email)
            Column {
                Text(text = "Shop :Sellappy", fontSize = 20.sp)
                Text(text = "Brand :Alison", fontSize = 18.sp)
                Text(text = "Location :Westlands", fontSize = 18.sp)
                Button(
                    onClick = {  val callIntent = Intent(Intent.ACTION_DIAL)
                        callIntent.data = "tel:0720245837".toUri()
                        mContext.startActivity(callIntent) },
                    colors = ButtonDefaults.buttonColors(red),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Call")
                    
                }

            }

        }






    }



}



@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}
