package com.example.giphy_application.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class GiphyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        val newUrl = request.url.newBuilder()
            .addQueryParameter("api_key", "bvgMlHSFSYZXxnDxdjxECXh3emi9J9Ap")
            .build()

        val newRequest = request.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }
}