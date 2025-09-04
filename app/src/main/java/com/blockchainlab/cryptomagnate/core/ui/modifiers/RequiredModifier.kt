package com.blockchainlab.cryptomagnate.core.ui.modifiers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Modifier.required(
    condition: Boolean,
    isFalseModifier: @Composable Modifier.() -> Modifier = { Modifier },
    isTrueModifier: @Composable Modifier.() -> Modifier,
): Modifier {
    return if (condition) this.isTrueModifier() else this.isFalseModifier()
}