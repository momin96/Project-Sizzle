package com.momins.projectsizzle

data class Address(
    val street: String,
    val city: String,
    val state: String,
    val country: String,
    val pinCode: String
)

data class Cuisine(
    val id: Int,
    val name: String,
    val imageResId: Int
)

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phoneNumber: String
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String?,
    val imageUrl: String?,
    val address: Address,
    val cuisines: List<Cuisine>,
    val rating: Double,
    val reviews: Int
)