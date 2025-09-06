package com.blockchainlab.cryptomagnate.core.ui.resources

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun CryptoMagnateTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            background = BaseColors.mainBackgroundColor,
        ),
        shapes = MaterialTheme.shapes.copy(BaseShapes.CmShape12),
        typography = MaterialTheme.typography,
        content = content
    )
}
