package com.blockchainlab.cryptomagnate.features.profile.impl.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.blockchainlab.cryptomagnate.core.ui.scaffolds.BaseScaffold
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileHandler
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileState

@Composable
fun ProfileView(
    state: ProfileState,
    handler: ProfileHandler,
) {
    BaseScaffold(
        topBar = {
            Box(Modifier.fillMaxWidth().background(Color.Green)) {
                Text("12312312312312")
            }
        },
        bottomBar = {
            Box(Modifier.fillMaxWidth().background(Color.Gray)) {
                Text("12312312312312")
            }
        },

    ) {
        Box(Modifier.fillMaxWidth().background(Color.Blue)) {
            Text("12312312312312")
        }
    }
}
