package com.example.bussinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.isDebugInspectorInfoEnabled
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier) {
    val iLogo = painterResource(R.drawable.jean_logo)

    Box(
        modifier = modifier
            .background(Color(0xFFd2e8d4))
            .fillMaxSize()
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(20.dp)
                .align(Alignment.Center)
        ) {
            Image(
                painter = iLogo,
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = modifier
                    .padding(bottom = 10.dp)
                    .clip(CircleShape)
            )
            Text(
                text = "Mochii",
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
                lineHeight = 40.sp,
                modifier = modifier
                    .padding(bottom = 10.dp)
            )
            Text(
                text = "Professional Sleeper",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2d8254)
            )
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(bottom = 50.dp)
                .align(Alignment.BottomCenter)
        ) {
            DataCard(
                image = painterResource(R.drawable.call_black_24dp),
                description = "+57 304 117 1197",
                modifier = modifier.align(Alignment.Start)
            )
            DataCard(
                image = painterResource(R.drawable.code_black_24dp),
                description = "github.com/notpunpun",
                modifier = modifier.align(Alignment.Start)
            )
            DataCard(
                image = painterResource(R.drawable.email_black_24dp),
                description = "sleepyllamahead@gmail.com",
                modifier = modifier.align(Alignment.Start)
            )
        }
    }
}

@Composable
fun DataCard(image: Painter, description: String, modifier: Modifier) {
    Row(
        modifier = modifier.padding(5.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier.padding(end = 20.dp)
        )
        Text(
            text = description,
            fontWeight = FontWeight.Light
        )
    }
}

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BussinessCardAppTheme {
        App()
    }
}