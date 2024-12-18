package com.example.evalkotlin.data.model

// Data class des personnages
data class Character(
    val id: Int,
    val name: String, // Nom du personnage
    val role: String, // Rôle du personnage
    val description: String, // Description du personnage
    val abilities: List<Ability> // Liste des capacités du personnage
)
