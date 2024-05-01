package com.appdev.mysplash.presentation.common

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import com.appdev.mysplash.R
import com.appdev.mysplash.ui.theme.Blue
import org.w3c.dom.Text

@Composable
fun FoodButton(
    text: String,
    onclik:()->Unit
){
    Button(onClick = onclik,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Blue
        )) {
        Text(text = text, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold))
    }
}



@Composable
fun FoodTextButton(
    text:String,
    onclik: () -> Unit
){
    androidx.compose.material3.TextButton(onClick = onclik) {
        Text(text = text, style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = colorResource(id = R.color.display_small))

    }
}