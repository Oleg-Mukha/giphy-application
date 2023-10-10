package com.example.giphy_application.views.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.giphy_application.R
import com.example.giphy_application.databinding.ItemListBinding
import com.example.giphy_application.network.data.Gif

class GiphyViewHolder(private val binding: ItemListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(gif: Gif) {
        binding.apply {
            Glide.with(itemView)
                .load(gif.images?.original?.url)
                .thumbnail(Glide.with(itemView).load(R.drawable.loading))
                .into(ivGif)
        }
    }
}