package com.app.basis_assignment.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface APIClient {

    @GET("fjaqJ")
    fun getResponseFromAPI() : Single<String>

}