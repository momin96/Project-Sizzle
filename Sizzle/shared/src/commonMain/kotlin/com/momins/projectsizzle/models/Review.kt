package com.momins.projectsizzle.models

data class Review(
    val rating: Double,
    val comment: String,
    val user: User
)