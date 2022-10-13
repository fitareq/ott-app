package com.fitareq.ottapp.ui.home_page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitareq.ottapp.databinding.CarouselItemBinding
import com.fitareq.ottapp.databinding.RailItemBinding
import com.squareup.picasso.Picasso

class CarouselAdapter(
    private val items: List<String>
) : RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    inner class CarouselViewHolder(
        val binding: CarouselItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(
            CarouselItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        Picasso.get().load(items[position]).fit().into(holder.binding.carouselImage)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}