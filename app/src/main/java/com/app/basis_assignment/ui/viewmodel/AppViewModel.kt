package com.app.basis_assignment.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.app.basis_assignment.remote.data.ResponseDTO
import com.app.basis_assignment.repo.AppRepo
import com.app.basis_assignment.remote.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
open class AppViewModel @Inject constructor(private val appRepo: AppRepo) : ViewModel() {

     fun getData(): LiveData<Resource<ResponseDTO>> {
        return appRepo.getResponseFromAPI()

        }
}