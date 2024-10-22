package com.example.aluchat.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluchat.R


@Preview(showSystemUi = true)
@Composable
fun SignInScreen(){
    val brush1=Brush.linearGradient(listOf(Color(0xFF2D93E2),Color(0xff255dcc)))
Image(painter = painterResource(id = R.drawable.login_blur), contentDescription = null, modifier = Modifier.fillMaxSize(),contentScale=ContentScale.Crop )
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.oig4__rndcloiljdx4hxpn), contentDescription = null)
        Text(text = "Chat App", style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.ExtraBold), color = Color(0xff101010))
Text(
    text = "This is a normal text descriprion for the application",
    style = MaterialTheme.typography.titleMedium,
    textAlign = TextAlign.Center,
    color = Color(0xff101010))
        Spacer(modifier = Modifier.height(60.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .background(brush1, CircleShape)
                .fillMaxWidth(.7f)
                .height(60.dp), colors = ButtonDefaults.buttonColors(Color.Transparent))
        {
            Text(text = "Continue with Google", modifier = Modifier.padding(end = 20.dp))

        }
    }


}