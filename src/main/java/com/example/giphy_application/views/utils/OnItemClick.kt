package com.example.giphy_application.views.utils

import com.example.giphy_application.network.data.Gif

interface OnItemClick {
    fun onItemClick(gif: Gif)
}