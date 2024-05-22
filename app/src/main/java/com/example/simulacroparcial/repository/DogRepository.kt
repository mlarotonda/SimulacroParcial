package com.example.simulacroparcial.repository

import com.example.simulacroparcial.entities.Dog

class DogRepository {
    private val dogs = listOf(
        Dog(
            id = "1",
            name = "Fido",
            age = 3,
            gender = "Male",
            breed = "Beagle",
            subBreed = null,
            description = "Friendly and energetic.",
            weight = 12.0,
            location = "Buenos Aires",
            images = listOf("https://example.com/dog1.jpg"),
            adoptiveName = null,
            phone = null
        ),
        Dog(
            id = "2",
            name = "Bella",
            age = 2,
            gender = "Female",
            breed = "Labrador",
            subBreed = "Retriever",
            description = "Loyal and loving.",
            weight = 25.0,
            location = "Córdoba",
            images = listOf("https://example.com/dog2.jpg"),
            adoptiveName = null,
            phone = null
        )
        // Add more dogs as needed...
    )

    fun getDogs() = dogs

    fun getDogById(id: String) = dogs.find { it.id == id }

    fun addDogToFavorites(dog: Dog) {
        // Implementation for adding to favorites
    }

    fun getFavoriteDogs(): List<Dog> {
        // Implementation for getting favorite dogs
        return listOf()
    }
}
