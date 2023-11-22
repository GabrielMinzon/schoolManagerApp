package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun registerCourse(navController: NavHostController){
    Scaffold(
        topBar = { Text(text = "Cadastro de Curso")}
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Digite os dados do Curso")

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Salvar")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = { navController.navigate(Destination.homePage.route) }) {
                    Text(text = "Home")
                }
                Button(onClick = { navController.navigate(Destination.registerStudent.route) }) {
                    Text(text = "Cadastrar Aluno")
                }
            }
        }
    }
}