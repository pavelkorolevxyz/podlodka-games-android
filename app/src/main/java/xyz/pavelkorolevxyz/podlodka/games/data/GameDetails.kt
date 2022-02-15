package xyz.pavelkorolevxyz.podlodka.games.data

import androidx.annotation.DrawableRes

data class GameDetails(
    @DrawableRes val headerImage: Int,
    @DrawableRes val logoImage: Int,
    val title: String,
    val description: String,
    val tags: List<String>,
    val mediaList: List<Media>,
    val ratingInfo: RatingInfo,
    val reviews: List<Review>,
)
