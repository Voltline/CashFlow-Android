package com.voltline.cashflow

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        text = "CashFlow",
        modifier = modifier
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column {
        Title(Modifier
                .padding(top = 30.dp)
                .padding(horizontal = 50.dp)
        )
        Greeting("World", modifier = modifier)
    }
}