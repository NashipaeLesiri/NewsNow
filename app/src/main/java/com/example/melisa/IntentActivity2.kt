package com.example.melisa

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri




class IntentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents(){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.ima), contentScale = ContentScale.FillBounds)){

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { Text(text = "Get Started", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription = "menu",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)
                }
                IconButton(onClick = {
                    val settingsIntent=Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)
                }
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,ExploreActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward,
                        contentDescription = "settings",
                        tint = Color.White)
                }

            }
        )

        //Intents

        //STK
        OutlinedButton(onClick ={
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SUBSCRIBE TO GET PREMIUM ARTILES")

        }

        Spacer(modifier = Modifier.height(20.dp))

        //EMAIL
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Nashipaelesiri@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "I have an inquiry towards the subcription")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "EMAIL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SHARE
        Button(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SHARE")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //CALL
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0710418376".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "CALL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SMS
        Button(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0791759877".toUri()
            smsIntent.putExtra("sms_body","What are the subscription packages?")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SMS")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SETTINGS
        Button(onClick = {
            val settingsIntent=Intent(Settings.ACTION_SETTINGS)
            mContext.startActivity(settingsIntent)


        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SETTINGS")
        }


        Spacer(modifier = Modifier.height(20.dp))

        //CAMERA
        Button(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "CAMERA")
        }


        Text(
            text = "Do not have an account? Register",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,FormActivity2::class.java))
                },
            textAlign = TextAlign.Center)







    }


}

@Preview(showBackground = true)
@Composable
fun MyIntentsPreview(){
    MyIntents()

}