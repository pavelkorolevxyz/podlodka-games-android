package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.navigationBarsPadding
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.BlackPearl
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Saffron

@Composable
fun MainButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ExtendedFloatingActionButton(
        modifier = modifier
            .padding(horizontal = 24.dp)
            .navigationBarsPadding()
            .fillMaxWidth()
            .height(64.dp),
        shape = RoundedCornerShape(12.dp),
        containerColor = Saffron,
        onClick = onClick,
        text = {
            Text(
                text = text,
                style = MaterialTheme.typography.titleLarge,
                color = BlackPearl,
            )
        },
    )
}

@Preview
@Composable
private fun MainButtonPreview() {
    MainButton(
        text = "Click",
        onClick = {},
    )
}
