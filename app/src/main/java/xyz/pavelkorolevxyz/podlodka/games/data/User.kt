package xyz.pavelkorolevxyz.podlodka.games.data

import androidx.annotation.DrawableRes

data class User(
    @DrawableRes val avatar: Int,
    val name: String,
)
