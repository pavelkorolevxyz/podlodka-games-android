package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.*
import xyz.pavelkorolevxyz.podlodka.games.createMockGame
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
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            HeaderImage(painter = painterResource(id = game.headerImage))
        }
        item {
            GameTitle(
                title = game.title,
                rating = game.ratingInfo.rating,
                ratingNumber = game.ratingInfo.number,
            )
        }
        item {
            TagsFlowRow(tags = game.tags)
        }
        item {
            Text(
                modifier = Modifier.padding(24.dp),
                text = game.description,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
    TopOverlay()
    TopAppBar()
}

@Preview
@Composable
private fun GameScreenPreview() {
    GameScreen(game = createMockGame())
}
