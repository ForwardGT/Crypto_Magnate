package com.blockchainlab.cryptomagnate.features.profile.impl.screens

import com.blockchainlab.cryptomagnate.core.mvi.BaseViewModel

data class ProfileState(
    val q: String = "",
)

sealed interface ProfileAction {

}

sealed interface ProfileEffect {

}

class ProfileStore() : BaseViewModel<ProfileState, ProfileEffect, ProfileAction>(
    initialState = ProfileState()
) {

    override fun dispatch(action: ProfileAction) {
        when (action) {

            else -> {}
        }
    }
}
