package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R

@Composable
fun TopAppBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(24.dp),
    ) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
            CircleButton(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = "Back",
                onClick = {},
            )
        }
        Box(modifier = Modifier.align(Alignment.CenterEnd)) {
            CircleButton(
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = "Back",
                onClick = {},
            )
        }
    }
}
