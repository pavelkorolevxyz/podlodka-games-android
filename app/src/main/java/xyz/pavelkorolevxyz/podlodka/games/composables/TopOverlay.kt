package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp

@Composable
fun TopOverlay(
    modifier: Modifier = Modifier,
) {
    val gradientHeight = 100.dp
    val gradientColor = MaterialTheme.colorScheme.background
    val gradient = Brush.verticalGradient(
        colors = listOf(
            gradientColor,
            gradientColor.copy(alpha = 0f),
        ),
    )
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(gradientHeight)
            .background(gradient),
    )
}
