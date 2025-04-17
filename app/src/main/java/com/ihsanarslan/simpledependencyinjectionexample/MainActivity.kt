package com.ihsanarslan.simpledependencyinjectionexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ihsanarslan.simpledependencyinjectionexample.presentation.MyScreen
import com.ihsanarslan.simpledependencyinjectionexample.ui.theme.SimpleDependencyInjectionExampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleDependencyInjectionExampleTheme {
                MyScreen()
            }
        }
    }
}