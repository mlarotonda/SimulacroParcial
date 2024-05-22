package com.example.simulacroparcial.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simulacroparcial.R
import com.example.simulacroparcial.adapters.DogAdapter
import com.example.simulacroparcial.databinding.FragmentFavoritesBinding
import com.example.simulacroparcial.viewmodels.DogViewModel

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {
    private lateinit var viewModel: DogViewModel
    private lateinit var binding: FragmentFavoritesBinding
    private val dogAdapter = DogAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavoritesBinding.bind(view)
        viewModel = ViewModelProvider(this).get(DogViewModel::class.java)

        /*setupRecyclerView()
        observeFavoriteDogs()*/
    }

    /*private fun setupRecyclerView() {
        binding.rvFavorites.apply {
            adapter = dogAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun observeFavoriteDogs() {
        viewModel.favoriteDogs.observe(viewLifecycleOwner, {
            dogAdapter.submitList(it)
        })
    }*/
}
