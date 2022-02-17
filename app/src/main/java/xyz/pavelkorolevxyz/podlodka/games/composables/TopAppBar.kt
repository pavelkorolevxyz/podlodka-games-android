package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.statusBarsPadding
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PodlodkaGamesTheme

@Composable
fun TopAppBar(
    onNavigationItemClick: () -> Unit,
    onActionClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    TopOverlay()
    Row(
        modifier = modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        CircleButton(
            painter = painterResource(id = R.drawable.ic_arrow_left),
            contentDescription = stringResource(id = R.string.description_back),
            onClick = onNavigationItemClick,
        )
        CircleButton(
            painter = painterResource(id = R.drawable.ic_more),
            contentDescription = stringResource(id = R.string.description_more),
            onClick = onActionClick,
        )
    }
}

@Preview
@Composable
private fun TopAppBarPreview() {
    PodlodkaGamesTheme {
        TopAppBar(
            onNavigationItemClick = {},
            onActionClick = {},
        )
    }
}
