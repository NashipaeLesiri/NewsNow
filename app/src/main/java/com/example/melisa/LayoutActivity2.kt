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
import androidx.compose.foundation.lazy.LazyColumn
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
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan ),
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
            text = "TRENDING TOPICS TODAY",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
LazyColumn {
    item {
        //Row 1
        Row {
            Image(painter = painterResource(id = R.drawable.rus),
                contentDescription = "null",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Column {
                Text(
                    text = "Russia lost a huge amount of troops in a single week",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)
                Text(text = "On May 12, Newsweek’s Ellie Cook reported Moscow lost 8,030 troops and 79 tanks in the fighting that had occurred over the previous seven days of fighting on the frontlines")
            }

        }
        //End of Row 1
        Spacer(modifier = Modifier.height(20.dp))
        //Row 2
        Row {
            Image(painter = painterResource(id = R.drawable.tax),
                contentDescription = "null",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Column {
                Text(
                    text = "More Pain as Ruto promises to increase Tax",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)
                Text(text = "Azimio has urged Members of Parliament to reject the Finance Bill 2024, which is up for discussion, citing draconian taxation measures that will escalate the cost of living and plunge Kenyans into poverty"

                )
            }

        }
        //End of Row 2

        //Row 3
        Row {
            Image(painter = painterResource(id = R.drawable.well),
                contentDescription = "null",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Column {
                Text(
                    text = "Promoting employees' financial wellness during difficult times",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)
                Text(text = " It is paramount that employers recognise the importance of supporting their employees' financial wellness amidst these circumstances."

                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        val mContext = LocalContext.current
        //End of Row 3
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity2::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Subscribe to get access to different articles")

        }
    }
}




    }


}



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}