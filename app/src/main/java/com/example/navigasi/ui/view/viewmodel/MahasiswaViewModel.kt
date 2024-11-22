package com.example.navigasi.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasi.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MahasiswaViewModel : ViewModel() {
    private val _dataModel = MutableStateFlow(Mahasiswa())
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()


}