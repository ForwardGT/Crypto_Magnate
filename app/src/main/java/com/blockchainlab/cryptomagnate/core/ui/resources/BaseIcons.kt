package com.blockchainlab.cryptomagnate.core.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import com.blockchainlab.cryptomagnate.R.drawable as r

enum class BaseIcons(override val id: Int) : BaseDrawable {
    ArrowDrawable(r.ic_arrow_back),
    MockPng(r.mock_png),
    MockImageBitmap(r.spritesheet)
}

@Composable
fun BaseDrawable.toPaint() = painterResource(id)

@Composable
fun BaseDrawable.toBitmap() = ImageBitmap.imageResource(id)
