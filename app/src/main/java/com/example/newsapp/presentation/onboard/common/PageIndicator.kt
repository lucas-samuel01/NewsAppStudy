package com.example.newsapp.presentation.onboard.common


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.newsapp.presentation.onboard.Dimensions.indicatorSize
import com.example.newsapp.ui.theme.BlueGray

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = BlueGray
) {

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        repeat(pageSize) {
            Box(
                modifier = Modifier.size(indicatorSize).clip(CircleShape)
                    .background(color = if (it == selectedPage) selectedColor else unselectedColor)
            )
        }
    }
}