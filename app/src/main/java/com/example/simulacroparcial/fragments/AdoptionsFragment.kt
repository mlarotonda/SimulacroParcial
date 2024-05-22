package com.example.simulacroparcial.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simulacroparcial.adapters.DogAdapter
import com.example.simulacroparcial.databinding.FragmentAdoptionsBinding
import com.example.simulacroparcial.entities.Dog

class AdoptionsFragment : Fragment() {
    private var _binding: FragmentAdoptionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAdoptionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*val dogs = listOf(
            Dog("Buddy", "Golden Retriever", 2, "https://example.com/dog1.jpg"),
            Dog("Max", "Labrador", 3, "https://example.com/dog2.jpg"),
            Dog("Bella", "Beagle", 1, "https://example.com/dog3.jpg")
        )

        val adapter = DogAdapter(dogs)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}