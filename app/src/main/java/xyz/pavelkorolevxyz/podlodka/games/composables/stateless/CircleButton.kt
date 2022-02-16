package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Concrete0
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Concrete30
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.White28

@Composable
fun CircleButton(
    painter: Painter,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val strokeGradient = Brush.linearGradient(
        colors = listOf(
            Concrete0,
            Concrete30,
        ),
    )
    Button(
        modifier = modifier.size(56.dp),
        contentPadding = PaddingValues(0.dp),
        shape = CircleShape,
        border = BorderStroke(1.dp, strokeGradient),
        colors = ButtonDefaults.buttonColors(containerColor = White28),
        onClick = onClick,
        interactionSource = interactionSource,
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = Color.White,
        )
    }
}

@Preview
@Composable
private fun BackCircleButtonPreview() {
    CircleButton(
        painter = painterResource(id = R.drawable.ic_arrow_left),
        contentDescription = "Back",
        onClick = {},
    )
}

@Preview
@Composable
private fun PlayCircleButtonPreview() {
    CircleButton(
        modifier = Modifier.size(48.dp),
        painter = painterResource(id = R.drawable.ic_play),
        contentDescription = "Play",
        onClick = {},
    )
}
