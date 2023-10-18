package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Cuadrante(text1: String, text2: String, modifier: Modifier = Modifier, backgroundColor: Color) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom=16.dp)

        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun General(text1: String, text2: String,text3: String, text4:String,text5: String, text6: String,text7: String, text8:String){
    Column (Modifier.fillMaxWidth()){
        Row (Modifier.weight(1f)){
            Cuadrante(text1 = text1, text2 = text2, backgroundColor = Color(0xFFEADDFF),modifier = Modifier.weight(1f) )
            Cuadrante(text1 = text3, text2 = text4, backgroundColor = Color(0xFFD0BCFF),modifier = Modifier.weight(1f) )
        }
        Row (Modifier.weight(1f)){
            Cuadrante(text1 = text5, text2 = text6, backgroundColor = Color(0xFFB69DF8),modifier = Modifier.weight(1f))
            Cuadrante(text1 = text7, text2 = text8, backgroundColor = Color(0xFFF6EDFF),modifier = Modifier.weight(1f))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        General(
            text1 = "Text composable",
            text2 = "Displays text and follows the recommended Material Design guidelines.",
            text3 = "Image composable",
            text4 = "Creates a composable that lays out and draws a given Painter class object.",
            text5 = "Row composable",
            text6 = "A layout composable that places its children in a horizontal sequence.",
            text7 = "Column composable",
            text8 = "A layout composable that places its children in a vertical sequence.",

        )
    }
}