package com.blockchainlab.cryptomagnate.features.profile.api.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavigationProfile {

    @Serializable
    data object Profile
}