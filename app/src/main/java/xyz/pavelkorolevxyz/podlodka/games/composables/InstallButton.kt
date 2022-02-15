package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.BlackPearl
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Saffron

@Composable
fun InstallButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Saffron, contentColor = Color.Black),
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(20.dp),
    ) {
        Text(
            text = stringResource(id = R.string.action_install),
            style = MaterialTheme.typography.titleLarge,
            color = BlackPearl,
        )
    }
}

@Preview
@Composable
private fun InstallButtonPreview() {
    InstallButton()
}
