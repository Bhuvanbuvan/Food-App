package com.appdev.mysplash.presentation.onbording.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.appdev.mysplash.ui.theme.Blue
import com.appdev.mysplash.ui.theme.BlueGray

@Composable
fun Indicator(
    modifier: Modifier=Modifier,
    pageSize:Int,
    selectedPage:Int,
    selectedColor:Color= Blue,
    unselectedColor:Color= BlueGray
){
    Row(modifier =Modifier,
        horizontalArrangement = Arrangement.SpaceBetween
        ) {
        repeat(pageSize){page->
            Box(modifier = Modifier
                .padding(horizontal = 3.dp)
                .size(17.dp).clip(CircleShape)
                .background(color = if (page==selectedPage) selectedColor else unselectedColor)

            )
        }


    }
}