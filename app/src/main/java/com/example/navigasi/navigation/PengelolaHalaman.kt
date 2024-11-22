package com.example.navigasi.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi.ui.view.screen.DataView
import com.example.navigasi.ui.view.screen.MahasiswaFormView
import com.example.navigasi.ui.view.screen.RencanaStudyView
import com.example.navigasi.ui.view.screen.SplashView
import com.example.navigasi.ui.view.viewmodel.MahasiswaViewModel
import com.example.navigasi.ui.view.viewmodel.RencanaStudyViewModel

enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

