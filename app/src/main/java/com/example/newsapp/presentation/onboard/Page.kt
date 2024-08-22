package com.example.newsapp.presentation.onboard

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf<Page>(
    Page(
        title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fringilla nisi tristique dui imperdiet, non egestas elit pulvinar. Praesent elementum ex sit amet tempor pulvinar. Fusce fringilla sollicitudin posuer",
        image = R.drawable.ic_launcher_background
    ),
    Page(
        title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fringilla nisi tristique dui imperdiet, non egestas elit pulvinar. Praesent elementum ex sit amet tempor pulvinar. Fusce fringilla sollicitudin posuer",
        image = R.drawable.ic_launcher_background
    ),
    Page(
        title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fringilla nisi tristique dui imperdiet, non egestas elit pulvinar. Praesent elementum ex sit amet tempor pulvinar. Fusce fringilla sollicitudin posuer",
        image = R.drawable.ic_launcher_background
    )
)