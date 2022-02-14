package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.BlackPearl
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.BlackPearl0

@Composable
fun TopOverlay() {
    val gradientHeight = 100.dp
    val gradient = Brush.verticalGradient(
        colors = listOf(
            BlackPearl,
            BlackPearl0,
        ),
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(gradientHeight)
            .background(gradient),
    )
}
