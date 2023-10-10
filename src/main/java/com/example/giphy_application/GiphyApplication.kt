package com.example.giphy_application

import android.app.Application
import com.example.giphy_application.network.di.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GiphyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@GiphyApplication)
            modules(retrofitModule)
        }
    }
}