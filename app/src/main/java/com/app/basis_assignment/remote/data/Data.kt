package com.app.basis_assignment.remote.data


import com.google.gson.annotations.SerializedName

open class Data(
    @SerializedName("id")
    var id: String,
    @SerializedName("text")
    val text: String
)