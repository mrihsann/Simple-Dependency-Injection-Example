package com.ihsanarslan.simpledependencyinjectionexample.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MyScreen() {

    val viewModel = hiltViewModel<MyViewModel>()

    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = viewModel.loadData(),
            modifier = Modifier.align(Alignment.Center)
        )
    }


}
