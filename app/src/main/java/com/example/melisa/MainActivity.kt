package com.example.melisa

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

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
    

Box {
    Image(painter = painterResource(id =com.example.melisa.R.drawable.news ),
        contentDescription =null,
                modifier= Modifier
                .fillMaxSize()
            .fillMaxHeight()
            .blur(radius = 7.dp, edgeTreatment = BlurredEdgeTreatment.Rectangle),





        contentScale = ContentScale.Crop


    )

}

        LazyColumn {
            item {    Spacer(modifier = Modifier.height(130.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp)
                        .padding(top = 10.dp)


                ){
                    Text(text = "Bringing Headlines to Your Fingertips",
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Normal,
                        fontSize = 56.sp,
                        textAlign = TextAlign.Left)
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(text = "Experience instant access to breaking news,in-depth articles and local updates with user friendly NewsNow",
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Normal,
                        fontSize = 23.sp,
                        textAlign = TextAlign.Left)




                    Spacer(modifier = Modifier.height(90.dp))


                    Card (){
                        Row{
                            Column {
                                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null,
                                    modifier = Modifier
                                        .border(
                                            width = 2.dp,
                                            color = Color.LightGray,
                                            shape = CircleShape
                                        )
                                        .size(width = 56.dp, height = 56.dp))


                            }
 val mContext = LocalContext.current
                            Button(onClick = {

                               mContext.startActivity(Intent(mContext,LayoutActivity2::class.java))

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












//            @Composable fun AnimatedBottomAppBar(
//                modifier: Modifier = Modifier,
//                backgroundColor: Color = MaterialTheme.colorScheme.primary,
//                arrowColor: Color = MaterialTheme.colorScheme.onPrimary,
//                animationDuration: Int = 300 )
//            { var arrowRotation by remember { mutableStateOf(0f) } LaunchedEffect(Unit)
//                { arrowRotation = 45f }
//                BottomAppBar(
//                    modifier = modifier
//                    .background(backgroundColor)
//                    .padding(horizontal = 16.dp)
////                    .cutoutShape = CircleShape )
//
//                { IconButton(onClick = { /* handle click */ })
//                { Icon( imageVector = Icons.Filled.ArrowUp,
//                    contentDescription = "Localized description",
//                    tint = arrowColor,
//                    modifier = Modifier.rotate(arrowRotation)
//                ) }
//                })

                }
            }
        }





























//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_ABOUT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "about"
//        )

//        Button(onClick = {
//            navController.navigate(ROUTE_ABOUT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//        }) {
//
//            Text(text = "sketchy about")
//
//        }

//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_CONTACT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "Contact"
//        )

//        Card(
//            colors = CardDefaults.cardColors(Color(0xffE52C04)),
//            elevation = CardDefaults.cardElevation(5.dp)
//
//        ) {
//
//
//
//        }

//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_PRODUCTS) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to products screen"
//
//        )
//
//        Button(onClick = {
//            navController.navigate(ROUTE_MIT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }}) {
//
//            Text(text = "fuurye")
//
//        }
//
//        Text(
//            modifier = Modifier
//
//                .clickable {
//                    navController.navigate(ROUTE_MIT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to mit",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_SHOP) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to shop screen",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//
//
//        OutlinedButton(onClick = {
//
//            navController.navigate(ROUTE_ADD_STUDENTS) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//
//        }) {
//
//            Text(text = "Add Students")
//
//        }

//    }
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center) {
//        Text(
//            text = "Welcome to Android",
//            color = Color.Magenta,
//            fontSize = 30.sp,
//            fontStyle = FontStyle.Italic,
//            fontWeight = FontWeight.Bold)
//
//        Text(text = "Android software development is the process by which applications are created for devices running the Android operating system. ")
//
//        Spacer(modifier = Modifier.height(10.dp))
//        val mContext = LocalContext.current
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Button(onClick = {
//                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
//            })
//            { Text("Destination") }
//        }
//
//
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Text(
//            text = "Introduction to Android",
//            color = Color.Magenta,
//            fontSize = 30.sp,
//            fontStyle = FontStyle.Italic,
//            fontWeight = FontWeight.Bold)
//
//        //Lottie Animation
//        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.android))
//        val progress by animateLottieCompositionAsState(composition)
//        LottieAnimation(composition, progress,
//            modifier = Modifier.size(100.dp)
//        )
//
//
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Text(
//            text = "Features of Android",
//            fontSize = 20.sp,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Magenta)
//                .height(40.dp),
//            textAlign = TextAlign.Center,
//            textDecoration = TextDecoration.Underline,
//            color = Color.White,
//            fontWeight = FontWeight.Bold)
//        Text(text = "1.Android Open Source Project so we can customize the OS based on our requirements.")
//        Text(text = "2.Android supports different types of connectivity for GSM, CDMA, Wi-Fi, Bluetooth, etc. for telephonic conversation or data transfer.")
//
//        Spacer(modifier = Modifier.height(10.dp))
//        Divider()
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Text(
//            text = "eMobilis Mobile Training Institute",
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold)
//
//        Box(modifier = Modifier.fillMaxWidth(),
//            contentAlignment = Alignment.Center) {
//            Image(painter = painterResource(id = R.drawable.cat),
//                contentDescription ="cat" ,
//                modifier =Modifier.size(100.dp) )
//
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))






        



//    }
//    
//
//
//
//}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}