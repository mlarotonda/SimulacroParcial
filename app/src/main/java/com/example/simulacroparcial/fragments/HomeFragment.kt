package com.example.simulacroparcial.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simulacroparcial.R
import com.example.simulacroparcial.adapters.DogAdapter
import com.example.simulacroparcial.databinding.FragmentHomeBinding
import com.example.simulacroparcial.viewmodels.DogViewModel

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var viewModel: DogViewModel
    private lateinit var binding: FragmentHomeBinding
    private val dogAdapter = DogAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        viewModel = ViewModelProvider(this).get(DogViewModel::class.java)

        setupRecyclerView()
        observeDogs()
    }

    private fun setupRecyclerView() {
        binding.rvDogs.apply {
            adapter = dogAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun observeDogs() {
        viewModel.dogs.observe(viewLifecycleOwner, {
            dogAdapter.submitList(it)
        })
    }
}
