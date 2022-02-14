package xyz.pavelkorolevxyz.podlodka.games

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import xyz.pavelkorolevxyz.podlodka.games.data.GameDetails
import xyz.pavelkorolevxyz.podlodka.games.data.RatingInfo
import xyz.pavelkorolevxyz.podlodka.games.screens.GameScreen
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PodlodkaGamesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    PodlodkaGamesTheme {
        GameScreen(game = createMockGame())
    }
}

fun createMockGame(): GameDetails = GameDetails(
    headerImage = 0,
    logoImage = 0,
    title = "DoTA 2",
    description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    tags = listOf("moba", "multiplayer", "strategy"),
    ratingInfo = RatingInfo(
        rating = 4.9,
        number = "70M",
    ),
    reviews = emptyList(),
)
