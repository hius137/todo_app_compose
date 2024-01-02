package com.hieuvm.todoapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hieuvm.todoapp.ui.home_page.HomeScreen
import com.hieuvm.todoapp.ui.note_page.NoteScreen


@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = "home") {
        composable(route = "home") {
            HomeScreen()
        }
        composable(route = "note") {
            NoteScreen()
        }
    }
}
