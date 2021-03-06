package xyz.pavelkorolevxyz.podlodka.games.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.composables.*
import xyz.pavelkorolevxyz.podlodka.games.data.models.GameDetails
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.onBackgroundSecondary

@Composable
fun GameScreen(
    game: GameDetails,
    onActionClick: () -> Unit,
    onBackClick: () -> Unit,
) {
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
                onClick = onActionClick,
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { padding ->
        Box {
            val lazyListState = rememberLazyListState()
            LazyColumn(
                contentPadding = rememberInsetsPaddingValues(
                    insets = LocalWindowInsets.current.systemBars,
                    applyTop = false,
                    additionalBottom = padding.calculateBottomPadding() + 96.dp,
                ),
                state = lazyListState,
            ) {
                item {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        ImageHeader(
                            modifier = Modifier.graphicsLayer {
                                val firstVisibleItemScrollOffset = lazyListState.firstVisibleItemScrollOffset
                                translationY = 0.12f * firstVisibleItemScrollOffset
                            },
                            painter = painterResource(id = game.headerImage),
                        )
                        GameHeader(
                            modifier = Modifier.padding(top = 270.dp),
                            title = game.title,
                            logoPainter = painterResource(id = game.logoImage),
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
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackgroundSecondary,
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
                    RatingRow(
                        rating = game.ratingInfo.rating,
                        ratingNumber = game.ratingInfo.number,
                    )
                }
                itemsIndexed(game.reviews) { index, item ->
                    ReviewRow(review = item)
                    if (index < game.reviews.lastIndex) {
                        Separator()
                    }
                }
            }
            TopAppBar(
                modifier = Modifier.navigationBarsPadding(),
                onNavigationItemClick = onBackClick,
                onActionClick = {},
            )
        }
    }
}
