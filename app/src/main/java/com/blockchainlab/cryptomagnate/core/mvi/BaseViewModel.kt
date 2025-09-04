package com.blockchainlab.cryptomagnate.core.mvi

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container

abstract class BaseViewModel<STATE : Any, SIDE_EFFECT : Any, ACTION : Any>(
    initialState: STATE,
) : ContainerHost<STATE, SIDE_EFFECT>, ViewModel() {

    private val ceh = CoroutineExceptionHandler { _, e ->
        Log.d("OrbitMVI", "BaseViewModel ceh", e)
    }

    override val container = container<STATE, SIDE_EFFECT>(
        initialState = initialState,
        buildSettings = {
            this.exceptionHandler = ceh
        }
    )

    abstract fun dispatch(action: ACTION)
}