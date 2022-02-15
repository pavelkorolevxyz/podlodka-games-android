package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue24

@Composable
fun TagsFlowRow(tags: List<String>) {
    FlowRow(
        modifier = Modifier.padding(horizontal = 24.dp),
        mainAxisSpacing = 10.dp,
        crossAxisSpacing = 10.dp,
    ) {
        for (tag in tags) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .background(PictonBlue24),
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                    text = tag.uppercase(),
                    style = MaterialTheme.typography.labelSmall,
                    color = PictonBlue,
                )
            }
        }
    }
}

@Preview
@Composable
private fun TagsFlowRowPreview() {
    TagsFlowRow(tags = listOf("strategy", "action", "shooter"))
}
