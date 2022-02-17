package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.EbonyClay
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Saffron

@Composable
fun RatingBar(
    rating: Double,
    count: Int = 5,
) {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        for (i in 0 until count) {
            RatingBarStar(i, rating)
        }
    }
}

@Composable
fun RatingBarStar(
    index: Int,
    rating: Double,
) {
    Box {
        val starPainter = painterResource(id = R.drawable.ic_star)
        Icon(
            painter = starPainter,
            contentDescription = null,
            tint = EbonyClay,
        )
        val part = rating - index
        val modifier = if (part > 1) {
            Modifier
        } else {
            when (LocalLayoutDirection.current) {
                LayoutDirection.Ltr -> Modifier.drawWithContent {
                    clipRect(right = size.width * part.toFloat()) {
                        this@drawWithContent.drawContent()
                    }
                }
                LayoutDirection.Rtl -> Modifier.drawWithContent {
                    clipRect(left = size.width - size.width * part.toFloat()) {
                        this@drawWithContent.drawContent()
                    }
                }
            }
        }
        Icon(
            modifier = modifier,
            painter = starPainter,
            contentDescription = null,
            tint = Saffron,
        )
    }
}

@Preview
@Composable
private fun RatingBarGoodPreview() {
    RatingBar(rating = 4.5, count = 5)
}

@Preview
@Composable
private fun RatingBarOkPreview() {
    RatingBar(rating = 2.3, count = 5)
}

@Preview
@Composable
private fun RatingBarEmptyPreview() {
    RatingBar(rating = 0.0, count = 5)
}

@Preview
@Composable
private fun RatingBarTenPreview() {
    RatingBar(rating = 9.0, count = 10)
}
