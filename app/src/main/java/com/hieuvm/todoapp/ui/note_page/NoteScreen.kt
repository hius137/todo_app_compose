package com.hieuvm.todoapp.ui.note_page

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hieuvm.todoapp.ui.home_page.Button


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    onBack: () -> Unit,
    onSave: () -> Unit,
){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xff252525),
        topBar = { TopBar(
            onBack = onBack,
            onSave = onSave,
            ) },
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            verticalArrangement = Arrangement.Center
        ) {
            TextField("Title")
            Spacer(modifier = Modifier.width(12.dp))
            TextField("Type something...")
        }
    }
}

@Composable
fun TopBar(
    onBack: () -> Unit,
    onSave: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            imageVector = Icons.Default.KeyboardArrowLeft,
            onAction = onBack
            )
        Button(
            imageVector = Icons.Default.Favorite,
            onAction = onSave,
            )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(title: String){
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = {
            Text(
                title,
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif,)
                },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color.Transparent)
    )
}