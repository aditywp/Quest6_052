package com.example.navigasi.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasi.model.Mahasiswa
import com.example.navigasi.model.RencanaStudi


@Composable
fun DataView(
    dataMHS: Mahasiswa,
    dataKRS: RencanaStudi,
    onBackButtonClicked: () -> Unit
){
    val listDataMHS = listOf(
        Pair("NIM", dataMHS.nim),
        Pair("Nama", dataMHS.nama),
        Pair("Email", dataMHS.email)
    )

    val listDataKRS = listOf(
        Pair("Mata Kuliah", dataKRS.mataKuliah),
        Pair("Kelas", dataKRS.kelas)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Text(text = "Detail Data Mahasiswa",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            )

        listDataMHS.forEach { data ->
            DetailMHS(
                judul = data.first,
                isinya = data.second
            )
        }

        listDataKRS.forEach { data ->
            DetailMHS(
                judul = data.first,
                isinya = data.second
            )
        }

        Button(
            onClick = {onBackButtonClicked()}) {
                Text(text = "Kembali")}
        }
    }

@Composable
fun DetailMHS(
    judul: String,
    isinya: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
    ) {

        Row(
        ) {
            Text(text = judul,
                modifier = Modifier.weight(1f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }
    }
}