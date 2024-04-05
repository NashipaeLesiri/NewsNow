package com.example.melisa

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class LayoutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Magenta),
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
                    val settingsIntent=Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)
                }
            }
            )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "K-DRAMAS I LOVE",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        //Row 1
        Row {
            Image(painter = painterResource(id = R.drawable.nokdu),
                contentDescription = "nokdu",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Column {
                Text(
                    text = "Tale of Nokdu",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)
                Text(text = "When a swordsman's family gets attacked by a group of female assassins, he adopts the disguise of a woman and sets out in pursuit of the truth.")
            }

        }
        //End of Row 1
        Spacer(modifier = Modifier.height(20.dp))
        //Row 2
        Row {
            Image(painter = painterResource(id = R.drawable.samdalri),
                contentDescription = "samdalri",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Column {
                Text(
                    text = "Welcome to Samdalri",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)
                Text(text = "After suffering a fall from grace, a photographer returns to her hometown and bumps into her childhood friend, rekindling an unfinished romance.")
            }

        }
        //End of Row 2
        Spacer(modifier = Modifier.height(20.dp))
        //Row 3
        val mContext = LocalContext.current
        //End of Row 3
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity2::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,LottieActivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Animation")

        }


    }


}



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}