package com.example.giphy_application.network.api

import com.example.giphy_application.network.data.GiphyResponse
import retrofit2.http.GET

interface GiphyApi {
    @GET("gifs/trending")
    suspend fun getTrendingGifs(): GiphyResponse
}