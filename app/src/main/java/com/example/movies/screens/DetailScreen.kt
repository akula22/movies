package com.example.movies.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import androidx.navigation.NavController
import com.example.movies.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text(text = "detail = ${itemId}")
}