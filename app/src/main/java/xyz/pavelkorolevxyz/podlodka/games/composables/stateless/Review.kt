package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.data.Review
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.White40

@Composable
fun Review(
    review: Review,
    isLast: Boolean,
) {
    Column(
        modifier = Modifier.padding(horizontal = 24.dp, vertical = 24.dp),
    ) {
        Row {
            val author = review.author
            Image(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = author.avatar),
                contentDescription = author.name,
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
        )
    }
    if (!isLast) {
        Separator()
    }
}
