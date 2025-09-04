package com.blockchainlab.cryptomagnate.core.ui.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.blockchainlab.cryptomagnate.core.ui.preview.BasePreview
import com.blockchainlab.cryptomagnate.core.ui.preview.LocalPreviewImage
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseDrawable
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseIcons
import com.blockchainlab.cryptomagnate.core.ui.resources.painter

@Composable
fun BaseImage(
    modifier: Modifier = Modifier,
    image: BaseDrawable,
    contentScale: ContentScale = ContentScale.Fit,
) {
    Image(
        modifier = modifier,
        painter = image.painter(),
        contentScale = contentScale,
        contentDescription = null,
    )
}

@Composable
fun BaseAsyncImage(
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    link: String,
) {
    if (!link.isEmpty()) {
        AsyncImage(
            modifier = modifier,
            contentScale = contentScale,
            contentDescription = null,
            model = link,
        )
    } else {
        LocalPreviewImage.current?.also {
            BaseImage(
                modifier = Modifier.size(100.dp),
                image = it,
            )
        }
    }
}

@Preview
@Composable
private fun BaseImagePreview() {
    BasePreview {
        BaseImage(
            modifier = Modifier.size(100.dp),
            image = BaseIcons.MockPng,
        )
        BaseAsyncImage(
            link = "",
            modifier = Modifier.size(100.dp),
        )
    }

}