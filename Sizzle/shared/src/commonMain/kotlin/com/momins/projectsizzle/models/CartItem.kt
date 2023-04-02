package com.momins.projectsizzle.models

data class CartItem(
    val item: MenuItem,
    var quantity: Int = 1,
    var createAt: Int,
    var updatedAt: Int
) {
    val subtotal: Double get() = item.price * quantity
}