package com.hieuvm.todoapp.ui.note_page

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hieuvm.todoapp.ui.home_page.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xff252525),
        topBar = { TopBar() },
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Notes",
                fontSize = 24.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(12.dp),
            )
        }
    }
}