package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.backgroundVariant

@Composable
fun Separator(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(horizontal = 38.dp)
            .background(MaterialTheme.colorScheme.backgroundVariant),
    )
}
