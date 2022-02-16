package xyz.pavelkorolevxyz.podlodka.games.composables.stateless

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue24

@Composable
fun TagsFlowRow(
    tags: List<String>,
    onTagClick: (String) -> Unit,
) {
    FlowRow(
        modifier = Modifier.padding(horizontal = 24.dp),
        mainAxisSpacing = 10.dp,
        crossAxisSpacing = 10.dp,
    ) {
        for (tag in tags) {
            Tag(
                title = tag,
                onClick = { onTagClick(tag) },
            )
        }
    }
}

@Composable
fun Tag(
    title: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = Modifier.height(22.dp),
        colors = ButtonDefaults.buttonColors(containerColor = PictonBlue24),
        contentPadding = PaddingValues(),
        onClick = onClick,
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 10.dp),
            text = title.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = PictonBlue,
        )
    }
}

@Preview
@Composable
private fun TagPreview() {
    Tag(
        title = "Tag",
        onClick = {},
    )
}

@Preview
@Composable
private fun TagsFlowRowPreview() {
    TagsFlowRow(
        tags = listOf("strategy", "action", "shooter"),
        onTagClick = {},
    )
}
