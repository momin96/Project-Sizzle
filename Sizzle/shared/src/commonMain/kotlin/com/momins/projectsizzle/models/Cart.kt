package com.momins.projectsizzle.models


data class Cart(
    val items: MutableList<CartItem> = mutableListOf()
) {
    val itemCount: Int get() = items.size

    val totalPrice: Double get() = items.sumOf { it.subtotal }

    fun add(item: MenuItem, quantity: Int = 1) {
        val existing = items.find { it.item == item }
        if (existing != null) {
            existing.quantity += quantity
        } else {
            items.add(CartItem(item, quantity))
        }
    }

    fun remove(item: MenuItem, quantity: Int = 1): Boolean {
        val existing = items.find { it.item == item }
        if (existing != null) {
            if (existing.quantity <= quantity) {
                items.remove(existing)
            } else {
                existing.quantity -= quantity
            }
            return true
        }
        return false
    }

    fun clear() {
        items.clear()
    }
}

data class CartItem(
    val item: MenuItem,
    var quantity: Int = 1
) {
    val subtotal: Double get() = item.price * quantity
}