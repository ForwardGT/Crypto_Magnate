package com.blockchainlab.cryptomagnate.core.ui.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blockchainlab.cryptomagnate.core.ui.base.BaseAsyncImage
import com.blockchainlab.cryptomagnate.core.ui.base.BaseImage
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseDrawable
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseIcons

@Composable
fun BasePreview(
    modifier: Modifier = Modifier,
    background: Color = Color.White,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(6.dp),
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    previewImage: BaseDrawable? = BaseIcons.MockPng,
    content: @Composable ColumnScope.() -> Unit,
) {
    CompositionLocalProvider(
        LocalPreviewImage provides previewImage,
    ) {
        Column(
            modifier = modifier
                .background(background)
                .padding(6.dp),
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment,
            content = content,
        )
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
