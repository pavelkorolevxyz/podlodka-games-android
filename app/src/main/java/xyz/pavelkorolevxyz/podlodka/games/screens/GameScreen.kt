package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.HeaderImage
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.TopAppBar
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.TopOverlay
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
    LazyColumn {
        item {
            HeaderImage(painter = painterResource(id = game.headerImage))
        }
    }
    TopOverlay()
    TopAppBar()
}
