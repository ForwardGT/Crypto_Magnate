package com.blockchainlab.cryptomagnate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.blockchainlab.cryptomagnate.features.profile.api.navigation.NavigationProfile
import com.blockchainlab.cryptomagnate.features.profile.impl.navigation.addProfile

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationProfile.Profile,
    ) {
        addProfile(navController)
    }
}
