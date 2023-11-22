package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun homePage(navController: NavHostController){

    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Home")}
        }
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Gerenciamento Escolar")
            Button(onClick = { navController.navigate(Destination.registerStudent.route) }) {
                Text(text = "Cadastrar Estudante")
            }
            Button(onClick = { navController.navigate(Destination.registerCourse.route) }) {
                Text(text = "Cadastrar Curso")
            }
        }
    }
}