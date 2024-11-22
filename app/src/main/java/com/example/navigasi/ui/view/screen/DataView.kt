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
    dataMhs: Mahasiswa,
    dataKrs: RencanaStudi,
    onBackButtonClicked: () -> Unit
){
    val listDataMHS = listOf(
        Pair("NIM", dataMhs.nim),
        Pair("Nama", dataMhs.nama),
        Pair("Email", dataMhs.email)
    )

    val listDataKRS = listOf(
        Pair("Mata Kuliah", dataKrs.mataKuliah),
        Pair("Kelas", dataKrs.kelas)
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
            DetailMhs(
                judul = data.first,
                isinya = data.second
            )
        }

        listDataKRS.forEach { data ->
            DetailMhs(
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
fun DetailMhs(
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