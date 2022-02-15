package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.data.Media

@Composable
fun MediaItem(media: Media) {
    Box(
        modifier = Modifier.height(128.dp),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            modifier = Modifier.clip(RoundedCornerShape(14.dp)),
            painter = painterResource(id = media.thumbnail),
            contentDescription = "Media",
        )
        if (media.isVideo) {
            CircleButton(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                onClick = {},
            )
        }
    }
}

@Composable
fun MediaCarousel(
    mediaList: List<Media>,
) {
    LazyRow(
        modifier = Modifier
            .padding(bottom = 24.dp),
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        for (media in mediaList) {
            item {
                MediaItem(media = media)
            }
        }
    }
}

@Preview
@Composable
fun MediaItemPreview() {
    MediaItem(
        media = Media(
            thumbnail = R.drawable.screenshot_dota_1,
            isVideo = true,
        ),
    )
}
