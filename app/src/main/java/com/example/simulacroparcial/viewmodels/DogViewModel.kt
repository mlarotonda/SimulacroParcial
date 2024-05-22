package com.example.simulacroparcial.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.simulacroparcial.entities.Dog
import com.example.simulacroparcial.repository.DogRepository

class DogViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = DogRepository()
    private val _dogs = MutableLiveData<List<Dog>>()
    val dogs: LiveData<List<Dog>> = _dogs

    private val _favoriteDogs = MutableLiveData<List<Dog>>()
    val favoriteDogs: LiveData<List<Dog>> = _favoriteDogs

    init {
        _dogs.value = repository.getDogs()
    }

    fun addDogToFavorites(dog: Dog) {
        repository.addDogToFavorites(dog)
        // Update favorites list
    }
}
