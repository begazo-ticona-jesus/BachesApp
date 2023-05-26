package com.romzc.bachesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.romzc.bachesapp.R.drawable
import com.romzc.bachesapp.ui.composables.CustomNavBar

@Composable
fun ScreenReportDetail (navController: NavController){
    CustomNavBar(navController = navController, title = "Detalle")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ITEM 1")
        Image(
            painter = painterResource(drawable.ic_baseline_report_24),
            contentDescription = "Image description",
            modifier = Modifier
                .padding(10.dp, 0.dp)
                .size(100.dp)
        )
        Text(text = "descripcion: asnalsknfdalksnflknasflaslfknlaksfnlkasnflkasfnlkasnflkasnflkasnf")
        Text(text = "GRAVEDAD: LEVE")
        Text(text = "Registrado por: user asasd")
    }
}