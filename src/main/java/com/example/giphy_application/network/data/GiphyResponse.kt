package com.example.giphy_application.network.data

import com.google.gson.annotations.SerializedName

data class GiphyResponse(
    @SerializedName("data") val data: List<Gif>?
)