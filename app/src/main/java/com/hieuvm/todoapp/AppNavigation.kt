package com.hieuvm.todoapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hieuvm.todoapp.Destinations.HOME
import com.hieuvm.todoapp.Destinations.NOTE
import com.hieuvm.todoapp.ui.home_page.HomeRoute
import com.hieuvm.todoapp.ui.note_page.NoteRoute

object Destinations{
    const val HOME = "home"
    const val NOTE = "note"
}
@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = "home") {
        composable(route = "home") {
            HomeRoute(onCreateNote = { navController.navigate(NOTE) })
        }
        composable(route = "note") {
            NoteRoute(onBack = {navController.navigate(HOME)})
        }
    }
}
