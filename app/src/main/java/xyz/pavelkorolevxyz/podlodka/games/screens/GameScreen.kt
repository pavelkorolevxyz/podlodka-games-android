package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.composables.InstallButton
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
    Box(
        modifier = Modifier.navigationBarsPadding(),
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(bottom = 100.dp),
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
            item {
                MediaCarousel(
                    mediaList = game.mediaList,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(horizontal = 24.dp),
                    text = stringResource(id = R.string.reviews_title),
                    style = MaterialTheme.typography.titleMedium,
                )
            }
            item {
                ReviewsTitle(
                    rating = game.ratingInfo.rating,
                    ratingNumber = game.ratingInfo.number,
                )
            }
            val reviews = game.reviews
            for ((index, review) in reviews.withIndex()) {
                item {
                    Review(
                        review = review,
                        isLast = index == reviews.lastIndex,
                    )
                }
            }
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter,
        ) {
            InstallButton()
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
