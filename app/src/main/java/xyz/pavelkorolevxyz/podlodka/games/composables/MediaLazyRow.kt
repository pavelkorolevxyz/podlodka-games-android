package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.data.models.Media

@Composable
fun MediaLazyRow(
    mediaList: List<Media>,
    onMediaClick: (Media) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier.padding(bottom = 24.dp),
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(mediaList) { media ->
            MediaItem(
                media = media,
                onClick = { onMediaClick(media) },
            )
        }
    }
}

@Composable
fun MediaItem(
    media: Media,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Box(
        modifier = modifier
            .height(128.dp)
            .clip(RoundedCornerShape(14.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = LocalIndication.current,
            ) { onClick() },
        contentAlignment = Alignment.Center,
    ) {
        Image(
            modifier = Modifier,
            painter = painterResource(id = media.thumbnail),
            contentDescription = "Media",
        )
        if (media.isVideo) {
            CircleButton(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                onClick = onClick,
                interactionSource = interactionSource,
            )
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
        onClick = {},
    )
}
