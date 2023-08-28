package com.derlishn.gamemvvmapp.presentation.screens.singUp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.derlishn.gamemvvmapp.R
import com.derlishn.gamemvvmapp.presentation.components.DefaultButton
import com.derlishn.gamemvvmapp.presentation.components.DefaultTextField
import com.derlishn.gamemvvmapp.presentation.ui.theme.Darkgray500
import com.derlishn.gamemvvmapp.presentation.ui.theme.GameMVVMAppTheme
import com.derlishn.gamemvvmapp.presentation.ui.theme.Red500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingupContent() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        BoxHeader()
        CardForm()

    }
}

@Composable
fun BoxHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
            .background(Red500)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(35.dp))
            Image(
                modifier = Modifier
                    .height(130.dp)
                    .padding(top = 32.dp),
                painter = painterResource(id = R.drawable.user),
                contentDescription = ""
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardForm() {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var user by remember {
        mutableStateOf("")
    }
    var verficarPassword by remember {
        mutableStateOf("")
    }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 200.dp,
                start = 40.dp,
                end = 40.dp
            ),
        shape = RoundedCornerShape(40.dp),
        colors = CardDefaults.cardColors(
            containerColor = Darkgray500
        )
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        ) {
            Text(
                modifier = Modifier.padding(top = 40.dp),
                text = "REGISTRO",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Por favor ingresa estos datos para continuar",
                fontSize = 12.sp,
                color = Color.Gray
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 25.dp),
                value = user,
                onValueChange = {user = it},
                label = "Nombre de usuario",
                icon = Icons.Default.Person,
                keyboardType = KeyboardType.Email
            )
            DefaultTextField(
                modifier = Modifier.padding(top = 5.dp),
                value = email,
                onValueChange = {email = it},
                label = "Correo electronico",
                icon = Icons.Default.Email,
                keyboardType = KeyboardType.Email
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 5.dp),
                value = password,
                onValueChange = {password = it},
                label = "Contraseña",
                icon = Icons.Default.Email,
                hideText = true
            )
            DefaultTextField(
                modifier = Modifier.padding(top = 5.dp),
                value = verficarPassword,
                onValueChange = {verficarPassword = it},
                label = "Confirmar Contraseña",
                icon = Icons.Outlined.Lock,
                hideText = true
            )
            DefaultButton(text = "REGISTRATE",
                onClick = { /*TODO*/ }
            )


        }


    }
}

@Preview (
    showBackground = true,
    showSystemUi = true
        )
@Composable
fun PreviewSingupContent() {
    GameMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SingupContent()
        }
    }
}