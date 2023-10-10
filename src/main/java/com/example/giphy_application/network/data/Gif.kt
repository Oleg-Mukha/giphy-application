package com.example.giphy_application.network.data

import com.google.gson.annotations.SerializedName

data class Gif(
    @SerializedName("id") val id: String?,
    @SerializedName("title") val title: String?,
    @SerializedName("images") val images: Images?
)

data class Images(
    @SerializedName("original") val original: Original?
)

data class Original(
    @SerializedName("url") val url: String?
)