package com.hieuvm.todoapp.ui.home_page

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hieuvm.todoapp.R
import com.hieuvm.todoapp.ui.theme.TodoappTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xff252525),
        topBar = { TopBar() },
        floatingActionButton = { FloatActionButton() }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            verticalArrangement = Arrangement.Center
        ) {
            ImageCenter()
        }
    }
}

//data class HomeScreenState(
//
//)

@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Notes",
            fontSize = 24.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(12.dp),
        )
        Row(modifier = Modifier.padding(12.dp)) {
            Button(imageVector = Icons.Default.Search)
            Spacer(modifier = Modifier.width(12.dp))
            Button(imageVector = Icons.Default.Info)
        }

    }
}

@Composable
fun FloatActionButton() {
    FloatingActionButton(
        onClick = {  },
        containerColor = Color(0xff3B3B3B),
        modifier = Modifier
            .padding(12.dp)
            .clip(CircleShape)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "search",
            tint = Color(0xffffffff)
        )
    }
}

@Composable
fun ImageCenter() {
    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Use Image composable to display an image
        Image(
            painter = painterResource(id = R.drawable.ic_bg),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Create your first note !",
            fontSize = 24.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(12.dp),
        )

    }
}

@Composable
fun Button(imageVector: ImageVector) {
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .height(50.dp)
            .width(50.dp)
            .padding(12.dp)
            .background(Color(0xff3B3B3B), shape = RoundedCornerShape(15.dp)),
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = "search",
            tint = Color(0xffffffff)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TodoappTheme {
    }
}
