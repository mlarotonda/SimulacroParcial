package com.example.simulacroparcial.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simulacroparcial.databinding.FragmentCreatePostBinding

class CreatePostFragment : Fragment() {
    private var _binding: FragmentCreatePostBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreatePostBinding.inflate(inflater, container, false)
        return binding.root
    }

    /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)

         binding.btnSubmit.setOnClickListener {
             val name = binding.etName.text.toString()
             val breed = binding.etBreed.text.toString()
             val age = binding.etAge.text.toString().toIntOrNull()
             val imageUrl = binding.etImageUrl.text.toString()

             if (name.isNotEmpty() && breed.isNotEmpty() && age != null && imageUrl.isNotEmpty()) {
                 // Aquí puedes manejar la lógica para guardar los datos, como añadir a una lista local
                 // ya que no estamos usando base de datos ni retrofit por ahora
             } else {
                 // Mostrar un mensaje de error al usuario
             }
         }
     }*/

    /*override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
}