package xyz.pavelkorolevxyz.podlodka.games.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ColorScheme = lightColorScheme(
    background = Color(0xFF050B18),
    onBackground = Color(0xFFFFFFFF),
)

@Composable
fun PodlodkaGamesTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = ColorScheme,
        typography = Typography,
        content = content,
    )
}
