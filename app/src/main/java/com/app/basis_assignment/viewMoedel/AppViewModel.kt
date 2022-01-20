package com.app.basis_assignment.viewMoedel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.app.basis_assignment.remote.response.ResponseDTO
import com.app.basis_assignment.repo.AppRepo
import com.application.sunstonekotlinassignment.data.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(private val appRepo: AppRepo) : ViewModel() {
    fun getData(): LiveData<Resource<ResponseDTO>> {
        return appRepo.getDatafromAPI()

    }
}