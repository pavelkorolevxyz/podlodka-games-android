@file:Suppress("unused") // Lint doesn't understand ColorScheme extensions purpose

package xyz.pavelkorolevxyz.podlodka.games.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Saffron,
    onPrimaryContainer = BlackPearl,
    secondaryContainer = PictonBlue24,
    onSecondaryContainer = PictonBlue,
    tertiaryContainer = White28,
    onTertiaryContainer = White,
    background = BlackPearl,
    onBackground = White,
)

private val DarkColorScheme = darkColorScheme(
    primary = Saffron,
    onPrimaryContainer = BlackPearl,
    secondaryContainer = PictonBlue24,
    onSecondaryContainer = PictonBlue,
    tertiaryContainer = White28,
    onTertiaryContainer = White,
    background = BlackPearl,
    onBackground = White,
)

val ColorScheme.backgroundVariant: Color
    get() = EbonyClay

val ColorScheme.tertiaryVariant: Color
    get() = Concrete

val ColorScheme.onBackgroundSecondary: Color
    get() = LinkWater70

val ColorScheme.onBackgroundTertiary: Color
    get() = White40

val ColorScheme.onBackgroundTertiaryVariant: Color
    get() = Abbey

@Composable
fun PodlodkaGamesTheme(
    content: @Composable () -> Unit,
) {
    val colorScheme = when (isSystemInDarkTheme()) {
        true -> DarkColorScheme
        false -> LightColorScheme
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
