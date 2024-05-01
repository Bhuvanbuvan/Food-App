package com.appdev.mysplash.presentation.onbording

import androidx.annotation.DrawableRes
import com.appdev.mysplash.R

data class Pages(
    val title:String,
    val description:String,
    @DrawableRes val img:Int
)


val page= listOf(
    Pages("Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus semper convallis.",
        R.drawable.onbording1
        ),
    Pages("Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus semper convallis.",
        R.drawable.onbording3
    ),
    Pages("Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus semper convallis.",
        R.drawable.onbording2
    )
)