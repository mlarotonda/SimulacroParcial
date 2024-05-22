package com.example.simulacroparcial.entities

data class Dog(
    val id: String,
    val name: String,
    val age: Int,
    val gender: String,
    val breed: String,
    val subBreed: String?,
    val description: String,
    val weight: Double,
    val location: String,
    val images: List<String>,
    val adoptiveName: String?,
    val phone: String?
)
