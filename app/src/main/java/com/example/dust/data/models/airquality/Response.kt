package com.example.dust.data.models.airquality


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("body")
    val body: Body? = null,
    @SerializedName("header")
    val header: Header? = null
)
