package com.blockchainlab.cryptomagnate.core.ui.base

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseDrawable
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseIcons
import com.blockchainlab.cryptomagnate.core.ui.resources.toPaint

@Composable
fun BaseIcon(
    modifier: Modifier = Modifier,
    vector: ImageVector,
    tint: Color = Color.Black,
) {
    Icon(
        modifier = modifier,
        imageVector = vector,
        tint = tint,
        contentDescription = null,
    )
}

@Composable
fun BaseIcon(
    modifier: Modifier = Modifier,
    icon: BaseDrawable,
    tint: Color = Color.Black,
) {
    Icon(
        modifier = modifier,
        painter = icon.toPaint(),
        tint = tint,
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Composable
private fun BaseIconPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        BaseIcon(
            modifier = Modifier.size(26.dp),
            icon = BaseIcons.ArrowDrawable,
            tint = Color.DarkGray
        )

        BaseIcon(
            modifier = Modifier.size(26.dp),
            vector = Icons.Default.Build,
            tint = Color.DarkGray
        )
    }
}