package com.blendvision.playback.link.sample.common.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.blendvision.playback.link.sample.common.adapter.SessionItem
import com.blendvision.playback.link.sample.databinding.ViewSessionItemBinding

class SessionViewHolder(private val binding: ViewSessionItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(sessionItem: SessionItem) {
        binding.sessionTextView.text = sessionItem.text
    }

}