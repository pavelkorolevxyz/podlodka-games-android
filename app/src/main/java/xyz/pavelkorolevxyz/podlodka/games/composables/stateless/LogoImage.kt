package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.EbonyClay

@Composable
fun LogoImage(painter: Painter) {
    val shape = RoundedCornerShape(12.dp)
    Image(
        modifier = Modifier
            .size(88.dp)
            .border(2.dp, EbonyClay, shape)
            .clip(shape),
        painter = painter,
        contentDescription = null,
    )
}

@Preview
@Composable
private fun LogoImagePreview() {
    LogoImage(painter = painterResource(id = R.drawable.icon_dota))
}
