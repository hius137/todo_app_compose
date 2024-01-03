package com.hieuvm.todoapp.ui.note_page

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hieuvm.todoapp.ui.home_page.HomeScreen

@Composable
fun NoteRoute(
    onBack: () -> Unit,
){
    val noteViewModel: NoteViewModel = viewModel(factory = NoteViewModelFactory())
    NoteScreen(
        onBack = onBack,
        onSave = {  },
    )
}