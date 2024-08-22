package com.example.newsapp.presentation.onboard.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.R
import com.example.newsapp.presentation.onboard.Dimensions.largePadding
import com.example.newsapp.presentation.onboard.Dimensions.mediumPadding
import com.example.newsapp.presentation.onboard.Page

@Composable
fun OnBoardPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.5f),
            painter = painterResource(id = page.image),
            contentDescription = page.description,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(mediumPadding))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = largePadding),
            style = MaterialTheme.typography.displaySmall,
            color =  colorResource(id = R.color.display_small),
        )
        Text(
            modifier = Modifier.padding(horizontal = largePadding),
            text = page.description,
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )

    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_OnBoardPage(){
    OnBoardPage(page =Page(
        title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fringilla nisi tristique dui imperdiet, non egestas elit pulvinar. Praesent elementum ex sit amet tempor pulvinar. Fusce fringilla sollicitudin posuer",
        image = R.drawable.ic_launcher_background
    ))
}