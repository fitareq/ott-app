package com.fitareq.ottapp.ui.home_page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitareq.ottapp.databinding.RailItemBinding
import com.fitareq.ottapp.model.Item
import com.squareup.picasso.Picasso

class RailAdapter(
    private val items: List<Item>
) : RecyclerView.Adapter<RailAdapter.RailViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RailViewHolder {
        return RailViewHolder(
            RailItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RailViewHolder, position: Int) {
        //current item
        val item = items[position]

        //clip outline for rounder corner
        holder.binding.itemImage.clipToOutline = true
        //load image
        Picasso.get().load(item.Poster).fit().into(holder.binding.itemImage)
        //set title
        holder.binding.itemTile.text = item.Title
    }

    override fun getItemCount(): Int = items.size


    inner class RailViewHolder(
        val binding: RailItemBinding
    ) : RecyclerView.ViewHolder(binding.root)
}