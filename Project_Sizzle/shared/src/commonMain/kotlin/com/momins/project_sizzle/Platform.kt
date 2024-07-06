package com.momins.project_sizzle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform