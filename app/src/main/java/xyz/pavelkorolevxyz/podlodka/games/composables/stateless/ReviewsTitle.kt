package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Aluminium

@Composable
fun ReviewsTitle(
    rating: Double,
    ratingNumber: String,
) {
    Row(
        modifier = Modifier
            .padding(horizontal = 24.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = rating.toString(),
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            RatingBar(rating = rating)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$ratingNumber Reviews", // TODO to resources
                style = MaterialTheme.typography.labelMedium,
                color = Aluminium,
            )
        }
    }
}

@Preview
@Composable
fun ReviewTitlePreview() {
    ReviewsTitle(rating = 3.7, ratingNumber = "30K")
}
