package com.app.basis_assignment.repo


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.basis_assignment.di.MovieModule.ProvidesApiService
import com.app.basis_assignment.remote.apiService.APIClient
import com.app.basis_assignment.remote.response.ResponseDTO
import com.application.sunstonekotlinassignment.data.Resource
import com.application.sunstonekotlinassignment.data.ResponseHandler
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

open class AppRepo @Inject constructor() {
    var responseHandler = ResponseHandler()
    val mutableLiveData = MutableLiveData<Resource<ResponseDTO>>()

    fun getDatafromAPI(): LiveData<Resource<ResponseDTO>> {

        ProvidesApiService().create(APIClient::class.java).getCardFromAPIs()
            .map { unfilteredJson -> unfilteredJson.substring(1) } // The File Before removing the " / "
            .map { filteredJson ->
                Gson().fromJson(filteredJson,
                    ResponseDTO::class.java)
            } // The file After removing the " /"
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<ResponseDTO> {
                override fun onSubscribe(d: Disposable?) {

                }

                override fun onSuccess(t: ResponseDTO?) {
                    mutableLiveData.value = responseHandler.handleSuccess(t!!)
                }

                override fun onError(e: Throwable?) {
                    responseHandler.handleException<Throwable>(e!!)
                }

            })

        return mutableLiveData
    }
}