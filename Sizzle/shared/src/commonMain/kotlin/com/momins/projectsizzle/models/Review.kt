package com.momins.projectsizzle.models

data class Review(
    val rating: Float,
    val comment: String,
    val user: User
)