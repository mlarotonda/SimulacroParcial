package com.example.simulacroparcial.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacroparcial.databinding.ItemDogBinding
import com.example.simulacroparcial.entities.Dog

class DogAdapter : ListAdapter<Dog, DogAdapter.DogViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val binding = ItemDogBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = getItem(position)
        holder.bind(dog)
    }

    class DogViewHolder(private val binding: ItemDogBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dog: Dog) {
            binding.apply {
                tvDogName.text = dog.name
                tvDogBreed.text = dog.breed
                // Load image using your preferred image loading library
                // e.g., Glide.with(itemView).load(dog.images[0]).into(ivDogImage)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Dog>() {
        override fun areItemsTheSame(oldItem: Dog, newItem: Dog) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Dog, newItem: Dog) = oldItem == newItem
    }
}
