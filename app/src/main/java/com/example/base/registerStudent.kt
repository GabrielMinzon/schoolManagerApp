package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun registerStudent(navController: NavHostController){

    val nomeAluno = remember { mutableStateOf("")}
    val nomeResponsavel = remember { mutableStateOf("")}
    val cursoMatriculado = remember { mutableStateOf("")}

    Scaffold(
        topBar = { Text(text = "Cadastro de Aluno")}
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Prencha o Formulário")
            
            TextField(
                value = nomeAluno.value, onValueChange = { nomeAluno.value = it},
                label = { Text("Nome do Aluno")},
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = nomeResponsavel.value, onValueChange = { nomeResponsavel.value = it},
                label = { Text("Nome do Responsável")},
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = cursoMatriculado.value, onValueChange = { cursoMatriculado.value = it},
                label = { Text("Curso Matriculado")},
                modifier = Modifier.padding(16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Salvar")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { navController.navigate(Destination.homePage.route) }) {
                    Text(text = "Home")
                }
                Button(onClick = { navController.navigate(Destination.registerCourse.route) }) {
                    Text(text = "Cadastrar Curso")
                }
            }
        }
    }
}