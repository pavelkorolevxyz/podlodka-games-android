package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.data.models.Review
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Aluminium
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.White40

@Composable
fun ReviewRow(
    review: Review,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(24.dp),
    ) {
        Row {
            val author = review.author
            Image(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = author.avatar),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = author.name,
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = review.date,
                    style = MaterialTheme.typography.bodyMedium,
                    color = White40,
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = review.message,
            style = MaterialTheme.typography.bodyMedium,
            color = Aluminium,
        )
    }
}
