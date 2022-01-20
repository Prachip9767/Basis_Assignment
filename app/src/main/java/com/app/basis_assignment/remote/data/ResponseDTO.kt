package com.app.basis_assignment.remote.data


import com.google.gson.annotations.SerializedName

open class ResponseDTO(
    @SerializedName("data")
    val data: List<Data>
)