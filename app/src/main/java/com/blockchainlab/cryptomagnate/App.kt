package com.blockchainlab.cryptomagnate

import android.app.Application
import com.blockchainlab.cryptomagnate.features.profile.impl.di.profileDiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)

            modules(
                profileDiModule,
            )
        }
    }
}
