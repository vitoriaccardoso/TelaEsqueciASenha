package br.senai.sp.jandira.esqueciasenha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults


import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.esqueciasenha.ui.theme.EsqueciASenhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EsqueciASenhaTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Surface(
        color = Color(0xFFFFEE101)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 15.dp)
                .height(400.dp),

            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                modifier = Modifier
                    .size(height = 113.dp, width = 98.dp),

                painter = painterResource(id = R.drawable.calabreso),
                contentDescription = "Calabreso"
            )

            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .width(800.dp)
                    .height(700.dp)
            ){
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(lineHeight = 40.sp),
                        text = "Esqueceu sua senha? Não se preocupe!",
                    )
                    Spacer(modifier = Modifier.padding(10.dp))

                    Text( fontSize = 20.sp,
                        text = "Informe seu email para que \npossamos enviar a sua senha \ne digite o código recebido"
                    )

                    Spacer(modifier = Modifier.padding(10.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = { /*TODO*/ },
                        label = { Text("Informe o E-mail cadastrado") },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFFE9CE03), // Cor daborda quando o campo está focado
                            unfocusedBorderColor = Color(0xFFFE9CE03) // Cor da borda quando o campo não está focado
                        )
                    )

                    Spacer(modifier = Modifier.padding(10.dp))
                    Row {
                        OutlinedTextField( modifier = Modifier
                            .width(160.dp)
                            .height(50.dp),
                            value = "",
                            onValueChange = { /*TODO*/ },
                            label = { Text(text = "Insira o código aqui") },
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xFFFE9CE03), // Cor daborda quando o campo está focado
                                unfocusedBorderColor = Color(0xFFFE9CE03) // Cor da borda quando o campo não está focado
                            )

                        )

                        Button(modifier = Modifier.padding(5.dp),
                            onClick = { /*TODO*/ }) {
                            Text(text = "Enviar e-mail")
                        }

                    }

                }




            }



        }
    }
}
       // Column{


//            //{
//        // Image(painter = painterResource(id = R.drawable.calabreso), contentDescription = "Calabreso",
//                    modifier = Modifier
//                        .size(height = 113.dp, width = 98.dp)
//                        .offset(y = 20.dp, x = 146.dp),
//
//                    )
//                Text(text = "",
//                    modifier = Modifier
//                        .padding(top = 25.dp, start = 100.dp),
//                    fontSize = 24.sp,
//                    color = Color.White,
//                    fontWeight = FontWeight.Bold,
//                )



//            }








@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EsqueciASenhaTheme {
      Greeting()
    }
}

//  modifier = Modifier
//                    .size(height = 155.dp, width = 500.dp)
//                    .padding(0.dp),
//                colors = CardDefaults
//                    .cardColors(
//                        containerColor = Color(0xFFFFEE101)
//                    ),