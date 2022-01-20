package com.app.basis_assignment.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.basis_assignment.api.APIClient
import com.app.basis_assignment.di.AppModule.providesDataFromApi
import com.app.basis_assignment.remote.data.ResponseDTO
import com.app.basis_assignment.remote.Resource
import com.app.basis_assignment.remote.ResponseHandler
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

open class AppRepo @Inject constructor() {

    var responseHandler = ResponseHandler()
    val mutableLiveData = MutableLiveData<Resource<ResponseDTO>>()

    fun getResponseFromAPI(): LiveData<Resource<ResponseDTO>> {

        providesDataFromApi().create(APIClient::class.java).getResponseFromAPI()
            .map { unfilteredJson -> unfilteredJson.substring(1) }
            .map { filteredJson -> Gson().fromJson(filteredJson, ResponseDTO::class.java) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<ResponseDTO>{
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