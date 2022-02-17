package xyz.pavelkorolevxyz.podlodka.games.composables

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
import xyz.pavelkorolevxyz.podlodka.games.data.models.Tag
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue
import xyz.pavelkorolevxyz.podlodka.games.ui.theme.PictonBlue24

@Composable
fun TagsFlowRow(
    tags: List<Tag>,
    onTagClick: (Tag) -> Unit,
    modifier: Modifier = Modifier,
) {
    FlowRow(
        modifier = modifier.padding(horizontal = 24.dp),
        mainAxisSpacing = 10.dp,
        crossAxisSpacing = 10.dp,
    ) {
        for (tag in tags) {
            TagItem(
                tag = tag,
                onClick = { onTagClick(tag) },
            )
        }
    }
}

@Composable
fun TagItem(
    tag: Tag,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        modifier = modifier.height(22.dp),
        colors = ButtonDefaults.buttonColors(containerColor = PictonBlue24),
        contentPadding = PaddingValues(),
        onClick = onClick,
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 10.dp),
            text = tag.title.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = PictonBlue,
        )
    }
}

@Preview
@Composable
private fun TagPreview() {
    TagItem(
        tag = Tag("Tag"),
        onClick = {},
    )
}

@Preview
@Composable
private fun TagsFlowRowPreview() {
    TagsFlowRow(
        tags = listOf(
            Tag("strategy"),
            Tag("action"),
            Tag("shooter"),
        ),
        onTagClick = {},
    )
}
