package com.example.melisa

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.melisa.ui.theme.MelisaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Demo()

            
        }
    }
}

@Composable
fun Demo(){
    
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Welcome to Android",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)

        Text(text = "Android software development is the process by which applications are created for devices running the Android operating system. ")

        Spacer(modifier = Modifier.height(10.dp))
        val mContext = LocalContext.current
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            })
            { Text("Destination") }
        }

        Text(
            text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .height(30.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)
        Text(text = "1.BMW")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Toyota")


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Introduction to Android",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)

        Text(text = "Android operating system is the largest installed base among various mobile platforms across the globe. Hundreds of millions of mobile devices are powered by Android in more than 190 countries of the world.")

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Features of Android",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)
        Text(text = "1.Android Open Source Project so we can customize the OS based on our requirements.")
        Text(text = "2.Android supports different types of connectivity for GSM, CDMA, Wi-Fi, Bluetooth, etc. for telephonic conversation or data transfer.")

        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "eMobilis Mobile Training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.cat),
                contentDescription ="cat" ,
                modifier =Modifier.size(100.dp) )

        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
                         mContext.startActivity(Intent(mContext,LayoutActivity2::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
            
        }




        



    }
    



}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}