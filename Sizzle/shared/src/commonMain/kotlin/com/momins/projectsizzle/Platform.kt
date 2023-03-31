package com.momins.projectsizzle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform