package com.blockchainlab.cryptomagnate.core.ui.resources

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.blockchainlab.cryptomagnate.R

@Stable
object BaseFonts {
    val PlaypenSansFont = FontFamily(
        Font(
            resId = R.font.playpen_sans_text_regular,
            weight = FontWeight.Companion.W400,
            style = FontStyle.Companion.Normal,
        ),

        Font(
            resId = R.font.playpen_sans_text_medium,
            weight = FontWeight.Companion.W500,
            style = FontStyle.Companion.Normal,
        ),

        Font(
            resId = R.font.playpen_sans_text_bold,
            weight = FontWeight.Companion.Bold,
            style = FontStyle.Companion.Normal,
        ),
    )
}
