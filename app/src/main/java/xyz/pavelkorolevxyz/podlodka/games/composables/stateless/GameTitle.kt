package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.Abbey

@Composable
fun GameTitle(
    title: String,
    rating: Double,
    ratingNumber: String,
) {
    Box(
        // modifier = Modifier.offset(y = (-86).dp), // TODO
        contentAlignment = Alignment.BottomCenter,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(MaterialTheme.colorScheme.background),
        )
        Row(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
        ) {
            Box {
                LogoImage(painterResource(id = R.drawable.icon_dota))
            }
            Column(modifier = Modifier.padding(horizontal = 12.dp)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RatingBar(rating)
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = ratingNumber,
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
        }
    }
}
