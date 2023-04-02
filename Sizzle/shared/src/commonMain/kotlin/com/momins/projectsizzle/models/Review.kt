package com.momins.projectsizzle.models

data class Review(
    val rating: Double,
    val comment: String,
    val user: User,
    var createAt: Int,
    var updatedAt: Int,
)