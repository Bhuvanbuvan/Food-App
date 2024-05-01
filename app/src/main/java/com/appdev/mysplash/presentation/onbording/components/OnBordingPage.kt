package com.appdev.mysplash.presentation.onbording.components

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.content.res.Resources.Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appdev.mysplash.R
import com.appdev.mysplash.presentation.onbording.Pages
import com.appdev.mysplash.presentation.onbording.page
import com.appdev.mysplash.ui.theme.MySplashTheme

@Composable
fun OnBordingPage(
    modifier: Modifier =Modifier,
    pages: Pages){
    Column(modifier=modifier) {
        Image(
            modifier= Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = pages.img),
            contentDescription =null ,
            contentScale = ContentScale.Crop)

        Spacer(modifier = modifier.height(24.dp))

        Text(text = pages.title,
            modifier = Modifier.padding(horizontal = 30.dp),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small))

        Text(text = pages.description,
            modifier=Modifier.padding(horizontal = 30.dp),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium))

    }
}


@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun getPreview() {
    MySplashTheme {
        OnBordingPage(pages = page[0])
    }
}