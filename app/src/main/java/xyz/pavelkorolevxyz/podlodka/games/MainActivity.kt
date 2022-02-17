package xyz.pavelkorolevxyz.podlodka.games

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import xyz.pavelkorolevxyz.podlodka.games.data.*
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
            GameScreen(
                game = Mock.createGame(),
                onBackClick = onBackClick,
            )
        }
    }
}
