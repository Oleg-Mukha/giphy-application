package com.example.giphy_application.views.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.giphy_application.network.data.Gif

class GifDiffCallback : DiffUtil.ItemCallback<Gif>() {
    override fun areItemsTheSame(oldItem: Gif, newItem: Gif): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Gif, newItem: Gif): Boolean {
        return oldItem == newItem
    }
}