package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun HeaderImage(painter: Painter) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp),
        painter = painter,
        contentDescription = "Header",
        contentScale = ContentScale.Crop,
    )
}