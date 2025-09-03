package com.blockchainlab.cryptomagnate.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun CryptoMagnateTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            background = Color(0xff353434),
        ),
        shapes = MaterialTheme.shapes.copy(CmShapes.CmShape12),
        typography = MaterialTheme.typography,
        content = content
    )
}
