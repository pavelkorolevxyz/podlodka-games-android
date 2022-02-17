package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageHeader(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .height(327.dp),
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}
