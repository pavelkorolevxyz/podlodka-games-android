package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PodlodkaGamesTheme
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.onBackgroundTertiaryVariant

@Composable
fun GameHeader(
    title: String,
    logoPainter: Painter,
    rating: Double,
    ratingNumber: String,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 22.dp)
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(MaterialTheme.colorScheme.background),
        ) {
            Column(
                modifier = Modifier.padding(
                    top = 12.dp,
                    bottom = 24.dp,
                    start = 124.dp,
                    end = 24.dp,
                ),
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                )
                Spacer(modifier = Modifier.height(7.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RatingBar(rating)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = ratingNumber,
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.onBackgroundTertiaryVariant,
                    )
                }
            }
        }
        LogoImage(
            modifier = Modifier.padding(start = 24.dp),
            painter = logoPainter,
        )
    }
}

@Preview
@Composable
private fun GameTitlePreview() {
    PodlodkaGamesTheme {
        GameHeader(
            title = "Defence of the Ancients: Global Offensive",
            rating = 4.5,
            ratingNumber = "10K",
            logoPainter = painterResource(id = R.drawable.icon_dota),
        )
    }
}

@Preview
@Composable
private fun GameTitleOneLinePreview() {
    PodlodkaGamesTheme {
        GameHeader(
            title = "DoTA 2",
            rating = 4.5,
            ratingNumber = "10K",
            logoPainter = painterResource(id = R.drawable.icon_dota),
        )
    }
}
