package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.composables.stateless.*
import xyz.pavelkorolevxyz.podlodka.games.data.GameDetails

@Composable
fun GameScreen(game: GameDetails) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
        )
    }
    Scaffold(
        floatingActionButton = {
            MainButton(
                text = stringResource(id = R.string.action_install),
                onClick = {},
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { padding ->
        Box {
            LazyColumn(
                contentPadding = rememberInsetsPaddingValues(
                    insets = LocalWindowInsets.current.systemBars,
                    applyTop = false,
                    additionalBottom = padding.calculateBottomPadding() + 96.dp,
                ),
            ) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(374.dp),
                    ) {
                        HeaderImage(painter = painterResource(id = game.headerImage))
                        GameTitle(
                            title = game.title,
                            rating = game.ratingInfo.rating,
                            ratingNumber = game.ratingInfo.number,
                        )
                    }
                }
                item {
                    TagsFlowRow(
                        tags = game.tags,
                        onTagClick = {},
                    )
                }
                item {
                    Text(
                        modifier = Modifier.padding(24.dp),
                        text = game.description,
                        style = MaterialTheme.typography.bodyMedium,
                    )
                }
                item {
                    MediaLazyRow(
                        mediaList = game.mediaList,
                        onMediaClick = {},
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
                itemsIndexed(game.reviews) { index, item ->
                    Review(review = item)
                    if (index < game.reviews.lastIndex) {
                        Separator()
                    }
                }
            }
            TopAppBar(
                modifier = Modifier.navigationBarsPadding(),
            )
        }
    }
}
