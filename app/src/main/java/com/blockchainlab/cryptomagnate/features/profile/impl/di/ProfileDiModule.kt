package com.blockchainlab.cryptomagnate.features.profile.impl.di

import com.blockchainlab.cryptomagnate.features.profile.impl.screens.ProfileStore
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val profileDiModule = module {
    viewModelOf(::ProfileStore)
}
