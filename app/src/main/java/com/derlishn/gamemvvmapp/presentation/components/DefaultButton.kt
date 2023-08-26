package com.derlishn.gamemvvmapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.derlishn.gamemvvmapp.presentation.ui.theme.Red500

@Composable
fun DefaultButton (
    text: String,
    onClick: () -> Unit,
    color: Color = Red500,
    icon: ImageVector = Icons.Default.ArrowForward
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 40.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        onClick = { onClick() }
    ) {
        Icon(
            modifier = Modifier
                .padding(end = 5.dp),
            imageVector = icon,
            contentDescription = "",
            tint = Color.White
        )
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun PreviewDefaultButton() {

}