package xyz.pavelkorolevxyz.podlodka.games.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Aluminium

@Composable
fun RatingRow(
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
                text = stringResource(id = R.string.reviews_number, ratingNumber),
                style = MaterialTheme.typography.labelMedium,
                color = Aluminium,
            )
        }
    }
}

@Preview
@Composable
private fun ReviewTitlePreview() {
    RatingRow(rating = 3.7, ratingNumber = "30K")
}
