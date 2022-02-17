package xyz.pavelkorolevxyz.podlodka.games

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import xyz.pavelkorolevxyz.podlodka.games.data.Mock
import xyz.pavelkorolevxyz.podlodka.games.screens.GameScreen
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PodlodkaGamesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MainContent(
                onBackClick = {
                    finish()
                },
            )
        }
    }
}

@Composable
fun MainContent(onBackClick: () -> Unit) {
    PodlodkaGamesTheme {
        ProvideWindowInsets {
            val index = rememberSaveable { mutableStateOf(0) }
            val games = Mock.createGames()
            GameScreen(
                game = games[index.value],
                onActionClick = {
                    index.value = (index.value + 1) % games.size
                },
                onBackClick = onBackClick,
            )
        }
    }
}
