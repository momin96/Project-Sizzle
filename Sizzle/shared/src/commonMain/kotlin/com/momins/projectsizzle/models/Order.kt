package com.momins.projectsizzle.models

data class Order(
    val id: Int,
    val restaurantId: Int,
    val userId: Int,
    val items: List<MenuItem>,
    val totalAmount: Double,
    val timestamp: Long
)