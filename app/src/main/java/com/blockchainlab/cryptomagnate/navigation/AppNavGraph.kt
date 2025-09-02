package com.blockchainlab.cryptomagnate.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = TestScreen,
    ) {
        composable<TestScreen> {
            TestScreen()
        }
    }
}

@Serializable
data object TestScreen

@Composable
fun TestScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)) {
    }
}