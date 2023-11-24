package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun registerCourse(navController: NavHostController){
    val nomeCurso = remember { mutableStateOf("") }
    val descricaoCurso = remember { mutableStateOf("") }
    val coordenadorCurso = remember { mutableStateOf("") }

    Scaffold(
        topBar = { Text(text = "Cadastro de Curso")}
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Prencha o Formulário")

            TextField(
                value = nomeCurso.value, onValueChange = { nomeCurso.value = it},
                label = { Text("Nome do Curso")},
                modifier = Modifier.padding(16.dp)
            )

            TextField(
                value = descricaoCurso.value, onValueChange = { descricaoCurso.value = it},
                label = { Text("Descrição do Curso")},
                modifier = Modifier.padding(16.dp)
            )

            TextField(
                value = coordenadorCurso.value, onValueChange = { coordenadorCurso.value = it},
                label = { Text("Coordenador")},
                modifier = Modifier.padding(16.dp)
            )

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Salvar")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
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