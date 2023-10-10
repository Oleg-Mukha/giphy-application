package com.example.giphy_application.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.giphy_application.network.api.GiphyApi
import com.example.giphy_application.network.data.Gif
import kotlinx.coroutines.launch

class HomeViewModel(private val giphyApi: GiphyApi) : ViewModel() {
    private var _gifs = MutableLiveData<List<Gif>?>()
    val gifs: LiveData<List<Gif>?> = _gifs

    init {
        loadTrendingGifs()
    }

    private fun loadTrendingGifs() {
        viewModelScope.launch {
            val response = giphyApi.getTrendingGifs()
            _gifs.postValue(response.data)
        }
    }
}