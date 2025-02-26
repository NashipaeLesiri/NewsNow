package com.example.melisa

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.melisa.ui.theme.MelisaTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Destination", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {


                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "back",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,IntentActivity2::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward,
                        contentDescription = "forward",
                        tint = Color.White)
                }
                IconButton(onClick = {
                    val settingsIntent= Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)
                }
            }
        )
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){

            Image(painter = painterResource(id = R.drawable.beach),
                contentDescription = "stamp",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Let's plan your next vacation",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(10.dp))

        //Search Bar

        var search by remember { mutableStateOf("") }



        OutlinedTextField(
            value =search ,
            onValueChange = {search=it},
            placeholder = { Text(text = "What's your destination")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //End of Search Bar

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

       Row (
           modifier = Modifier.horizontalScroll(rememberScrollState())
       ){
           // Card 1

           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
           ){
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.newyork),
                           contentDescription = "betty")
                   }

                   Text(
                       text ="New York" ,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }
           }
           //End of Card 1
           Spacer(modifier = Modifier.width(5.dp))
           // Card 2

           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
           ){
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.cancun),
                           contentDescription = "betty")
                   }

                   Text(
                       text ="Cancun" ,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }
           }
           //End of Card 2
           Spacer(modifier = Modifier.width(5.dp))
           // Card 3

           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
           ){
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.sicily),
                           contentDescription = "betty")
                   }

                   Text(
                       text ="Sicily" ,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }
           }
           //End of Card 3
           Spacer(modifier = Modifier.width(5.dp))
           // Card 4

           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
           ){
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.sydney),
                           contentDescription = "betty")
                   }

                   Text(
                       text ="Sydney" ,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }
           }
           //End of Card 4
           Spacer(modifier = Modifier.width(5.dp))
           // Card 5

           Card (
               modifier = Modifier
                   .width(200.dp)
                   .height(200.dp)
           ){
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.seoul),
                           contentDescription = "betty")
                   }

                   Text(
                       text ="Seoul" ,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }
           }
           //End of Card 5
           Spacer(modifier = Modifier.width(5.dp))
       }














    }

}



@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}