package in.momin.projectsizzle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform