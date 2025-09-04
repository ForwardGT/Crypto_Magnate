package com.blockchainlab.cryptomagnate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.blockchainlab.cryptomagnate.core.ui.resources.CryptoMagnateTheme
import com.blockchainlab.cryptomagnate.navigation.AppNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()
            CryptoMagnateTheme {
                AppNavGraph(navController = navController)
            }
        }
    }
}
