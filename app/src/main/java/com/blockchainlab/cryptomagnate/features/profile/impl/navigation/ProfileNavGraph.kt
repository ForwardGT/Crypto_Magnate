package com.blockchainlab.cryptomagnate.features.profile.impl.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blockchainlab.cryptomagnate.features.profile.api.navigation.NavigationProfile
import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileScreen

fun NavGraphBuilder.addProfile(navController: NavController) {
    composable<NavigationProfile.Profile> {
        ProfileScreen(navController)
    }
}
