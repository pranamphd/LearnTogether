/*
 * Copyright (c) 2025. Pranam.
 * ORCID: https://orcid.org/0009-0007-9316-3616
 *
 * This code is licensed under the MIT License.
 *
 * You may obtain a copy of the License at https://opensource.org/licenses/MIT
 *
 * Attribution:
 * If you use this code, please provide appropriate credit to the original author.
 * For example: "This code is based on work by Pranam whose ORCID is https://orcid.org/0009-0007-9316-3616."
 */

package phd.pranam.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import phd.pranam.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Article()
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column {
        Image(
            painterResource(R.drawable.bg_compose_background),
            contentDescription = stringResource(R.string.article_content_description),
        )
        Text(
            text = stringResource(R.string.title_text),
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.topic_short_note),
            textAlign = Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.topic_detailed_note),
            textAlign = Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    LearnTogetherTheme {
        Article()
    }
}