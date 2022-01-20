package com.app.basis_assignment.remote.response


import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("data")
    val `data`: List<Data>
)