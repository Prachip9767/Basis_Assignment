package com.app.basis_assignment.remote.apiService



import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface APIClient {

    @GET("prachi")
    fun getCardFromAPIs() : Single<String>
}