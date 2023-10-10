package com.example.giphy_application.network.di

import com.example.giphy_application.network.api.GiphyApi
import com.example.giphy_application.network.interceptor.GiphyInterceptor
import com.example.giphy_application.screens.home.HomeViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofitModule = module {
    viewModel { HomeViewModel(get()) }

    single<GiphyApi> {
        val client = OkHttpClient.Builder()
            .addInterceptor(GiphyInterceptor())
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.giphy.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        return@single retrofit.create(GiphyApi::class.java)
    }
}