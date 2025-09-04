package com.blockchainlab.cryptomagnate.core.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.blockchainlab.cryptomagnate.R.drawable as r

enum class BaseIcons(override val id: Int) : BaseDrawable {
    ArrowDrawable(r.ic_arrow_back),
    MockPng(r.mock_png)
}

@Composable
fun BaseDrawable.painter() = painterResource(id)
