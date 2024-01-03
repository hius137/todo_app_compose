package com.hieuvm.todoapp.ui.home_page

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeRoute(onCreateNote: () -> Unit){
    val homeViewModel: HomeViewModel = viewModel(factory = HomeViewModelFactory())
    HomeScreen(
        onCreateNotes = onCreateNote,
        onSearch = {},
        onClickInfo = {},
    )
}