package br.senai.sp.jandira.ppdmmytrips.screen

import br.senai.sp.jandira.ppdmmytrips.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen (modifier: Modifier=Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = 0xFFFFFBED))
    ) {
            Card(
                modifier = Modifier
                    .width(130.dp)
                    .height(45.dp)
                    .align(Alignment.TopEnd),
                shape = RoundedCornerShape(
                    bottomStart = 10.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(color = 0xfffaa729)
                    ),
            ) {}
        Card(
            modifier = Modifier
                .width(130.dp)
                .height(45.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 10.dp
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(color = 0xfffaa729)
                ),
        ) {}
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 150.dp)
                    .padding(horizontal = 10.dp),
            ) {
                Column(
                )
                {
                    Text(

                        text = stringResource(R.string.login),
                        color = Color(color = 0xfffaa729),
                        fontSize = 52.sp,
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        color = Color(color = 0xfffaa729),
                        text = stringResource(R.string.login_subtitle)
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(vertical = 90.dp),
                ) {
                        OutlinedTextField(
                        modifier = Modifier
                            .padding(bottom = 25.dp),
                        value = "",
                        onValueChange = {},
                        label = {Text("teste@email.com")},
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label ={Text("**************")},
                        )
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.End),

                ) {
                    Button (onClick = { },
                        modifier=Modifier
                            .align(Alignment.End)
                            .width(200.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color(color =0xfffaa729 ))

                    ){
                        Text(
                            text = stringResource(R.string.sing),
                            fontSize = 30.sp
                        )
                    }
                    Row(
                        modifier = Modifier
                            .align(Alignment.End)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(vertical = 10.dp),
                            text = stringResource(R.string.donthave),
                            color = Color(color = 0xfffaa729),
                            fontSize = 15.sp
                        )
                        Text(
                            modifier = Modifier
                                .padding(vertical = 7.dp),
                            text = stringResource(R.string.singup),
                            color = Color(color = 0xfffaa729),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold

                        )
                    }
                }
            }
        }
    }
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}