package xyz.pavelkorolevxyz.podlodka.games.data.models

data class Review(
    val author: User,
    val date: String,
    val message: String,
)
