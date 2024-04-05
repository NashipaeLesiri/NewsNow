package com.example.melisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition


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
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                    ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.koda),
                            contentDescription ="koda",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Koda",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "2 years")

                        }

                    }










                    }



                }
            }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.lola),
                            contentDescription ="lola",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Lola",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "16 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.frankie),
                            contentDescription ="frankie",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Frankie",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "2 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.nox),
                            contentDescription ="nox",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Nox",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "8 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.faye),
                            contentDescription ="faye",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Faye",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "8 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.bella),
                            contentDescription ="bella",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Bella",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "14 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.moana),
                            contentDescription ="moana",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Moana",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "2 years")

                        }

                    }










                }



            }
        }//End of row 1
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Card (
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.tzeitel),
                            contentDescription ="tzeitel",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(20.dp)
                                .clip(CircleShape)
                                .size(40.dp)
                        )
                        Column {
                            Text(
                                text = "Tzietel",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 10.dp))
                            Text(
                                text = "7 years")

                        }

                    }










                }



            }
        }//End of row 1







    }

    }



@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}