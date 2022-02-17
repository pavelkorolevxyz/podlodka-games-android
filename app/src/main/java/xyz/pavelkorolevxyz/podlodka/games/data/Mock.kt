package xyz.pavelkorolevxyz.podlodka.games.data

import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.data.models.*

object Mock {

    fun createGame(): GameDetails = GameDetails(
        headerImage = R.drawable.header_dota,
        logoImage = R.drawable.icon_dota,
        title = "DoTA 2",
        description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams " +
            "of five players compete to collectively destroy a large structure defended by the " +
            "opposing team known as the \"Ancient\", whilst defending their own.",
        tags = listOf(
            Tag("moba"),
            Tag("multiplayer"),
            Tag("strategy"),
        ),
        mediaList = listOf(
            Media(
                thumbnail = R.drawable.screenshot_dota_1,
                isVideo = true,
            ),
            Media(
                thumbnail = R.drawable.screenshot_dota_2,
                isVideo = false,
            ),
        ),
        ratingInfo = RatingInfo(
            rating = 4.6,
            number = "70M",
        ),
        reviews = listOf(
            Review(
                author = User(
                    avatar = R.drawable.avatar_auguste,
                    name = "Auguste Conte",
                ),
                date = "February 14, 2019",
                message = "“Once you start to learn its secrets, there’s a wild and exciting variety " +
                    "of play here that’s unmatched, even by its peers.”",
            ),
            Review(
                author = User(
                    avatar = R.drawable.avatar_jang,
                    name = "Jang Marcelino",
                ),
                date = "February 14, 2019",
                message = "“Once you start to learn its secrets, there’s a wild and exciting variety " +
                    "of play here that’s unmatched, even by its peers.”",
            ),
        ),
    )
}
