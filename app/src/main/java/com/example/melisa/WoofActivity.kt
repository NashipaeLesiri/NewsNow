package com.example.melisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
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


class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()
        }
    }
}

@Composable
fun Woof(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.paw) ,
                contentDescription ="paw",
                modifier = Modifier.padding(50.dp)
            )
            Column {
                Text(
                    text = "Woof",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(horizontal = 1.dp, vertical = 50.dp))
            }
        }
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(60.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                    ){
                    Box (
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart){
                        Image(
                            painter = painterResource(id = R.drawable.koda),
                            contentDescription ="koda",
                            modifier = Modifier.fillMaxSize())

                    }

                }
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}