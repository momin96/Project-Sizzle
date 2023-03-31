package com.momins.projectsizzle.models

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String?,
    val imageUrl: String?,
    val address: Address,
    val cuisines: List<Cuisine>,
    val rating: Double,
    val reviews: List<Review>
)