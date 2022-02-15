package xyz.pavelkorolevxyz.podlodka.games.data

import androidx.annotation.DrawableRes

data class Media(
    @DrawableRes val thumbnail: Int,
    val isVideo: Boolean = false,
)
