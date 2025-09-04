package com.blockchainlab.cryptomagnate.features.profile.impl.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.blockchainlab.cryptomagnate.core.ui.animations.BaseSpriteAnimation
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseColors.White
import com.blockchainlab.cryptomagnate.core.ui.resources.BaseIcons
import com.blockchainlab.cryptomagnate.core.ui.resources.toBitmap
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
                Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
            ) {
                Text("top barrrrr")
                Text("top barrrrr")

            }
        },
        bottomBar = {
            Column(
                Modifier
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                BaseSpriteAnimation(
                    imageBitmap = BaseIcons.MockImageBitmap.toBitmap(),
                    frameCount = 4,
                    sizeImage = 128.dp,

                    )
            }
            Text("Contentttttt")
            Text("Contentttttt")
            Text("Contentttttt")
        }
    }
}
