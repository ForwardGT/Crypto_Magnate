package com.blockchainlab.cryptomagnate.features.profile.impl.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.components.ProfileView
import org.koin.androidx.compose.koinViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun ProfileScreen(
    navController: NavController,
) {
    val store = koinViewModel<ProfileStore>()
    val state by store.collectAsState()
    val handler = remember(store) { ProfileHandler(store) }

    ProfileView(state, handler)

    store.collectSideEffect {

    }
}
