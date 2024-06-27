package com.example.common

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform