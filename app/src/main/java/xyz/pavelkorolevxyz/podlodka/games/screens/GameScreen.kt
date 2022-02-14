package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.BackgroundSurface
import xyz.pavelkorolevxyz.podlodka.games.data.GameDetails

@Composable
fun GameScreen(game: GameDetails) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = Color.Transparent,
            darkIcons = false,
        )
    }
    BackgroundSurface {
        // TODO
    }
}
