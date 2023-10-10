package com.example.giphy_application.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.giphy_application.databinding.ItemListBinding
import com.example.giphy_application.network.data.Gif
import com.example.giphy_application.views.utils.GifDiffCallback
import com.example.giphy_application.views.utils.OnItemClick
import com.example.giphy_application.views.viewholders.GiphyViewHolder

class GiphyAdapter(private val onItemClick: OnItemClick?) : ListAdapter<Gif, GiphyViewHolder>(
    GifDiffCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GiphyViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GiphyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GiphyViewHolder, position: Int) {
        val gif = getItem(position)
        holder.bind(gif)

        holder.itemView.setOnClickListener {
            onItemClick?.onItemClick(gif)
        }
    }
}