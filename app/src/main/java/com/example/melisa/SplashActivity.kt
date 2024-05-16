package com.example.melisa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySplash()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(2000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()

            }
            }
        }
    }


@Composable
fun MySplash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.news), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row {
            Image(
                painter = painterResource(id = R.drawable.shop),
                contentDescription = "shop",
                Modifier.size(80.dp))
            Text(
                text = "NewsNow",
                fontSize = 50.sp,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,

                )

        }

        Text(
            text = "Experience News Differently",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Thin,

            )




    }

}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()
}