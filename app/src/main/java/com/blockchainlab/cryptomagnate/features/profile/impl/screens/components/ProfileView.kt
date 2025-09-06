package com.blockchainlab.cryptomagnate.features.profile.impl.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseColors.White
import com.blockchainlab.cryptomagnate.core.ui.scaffolds.BaseScaffold
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileHandler
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileState

@Composable
fun ProfileView(
    state: ProfileState,
    handler: ProfileHandler,
) {
    BaseScaffold(
        backgroundColor = White,
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
            ) {
                Text("top barrrrr")
                Text("top barrrrr")

            }
        },
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Magenta)
            ) {
                Text("bottom barrrrr")
                Text("bottom barrrrr")

            }
        }
    ) {
        Column(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxSize()
        ) {
//                BaseSpriteAnimation(
//                    imageBitmap = BaseIcons.MockImageBitmap.toBitmap(),
//                    frameCount = 4,
//                    sizeImage = 128.dp,
//
//                    )


        }
    }
}
