package xyz.pavelkorolevxyz.podlodka.games.data

import xyz.pavelkorolevxyz.podlodka.games.R
import xyz.pavelkorolevxyz.podlodka.games.data.models.*

object Mock {

    fun createGames(): List<GameDetails> = listOf(
        createDota(),
        createCounterStrike(),
    )

    private fun createDota(): GameDetails = GameDetails(
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

    private fun createCounterStrike(): GameDetails = GameDetails(
        headerImage = R.drawable.header_cs,
        logoImage = R.drawable.icon_cs,
        title = "Counter-Strike: Global Offensive",
        description = "Counter-Strike: Global Offensive (CS: GO) expands upon the team-based " +
            "action gameplay that it pioneered when it was launched 19 years ago. CS: GO " +
            "features new maps, characters, weapons, and game modes, and delivers updated " +
            "versions of the classic CS content (de_dust2, etc.).",
        tags = listOf(
            Tag("fps"),
            Tag("shooter"),
            Tag("multiplayer"),
            Tag("competitive"),
            Tag("action"),
        ),
        mediaList = listOf(
            Media(
                thumbnail = R.drawable.screenshot_cs_3,
                isVideo = true,
            ),
            Media(
                thumbnail = R.drawable.screenshot_cs_1,
                isVideo = true,
            ),
            Media(
                thumbnail = R.drawable.screenshot_cs_2,
                isVideo = false,
            ),
            Media(
                thumbnail = R.drawable.screenshot_cs_4,
                isVideo = true,
            ),
        ),
        ratingInfo = RatingInfo(
            rating = 3.8,
            number = "6M",
        ),
        reviews = listOf(
            Review(
                author = User(
                    avatar = R.drawable.avatar_harold,
                    name = "Harold",
                ),
                date = "January 1, 2019",
                message = "Good game",
            ),
            Review(
                author = User(
                    avatar = R.drawable.avatar_jang,
                    name = "Jang Marcelino",
                ),
                date = "February 14, 2019",
                message = """
                    >see a guy
                    >shoot him
                    >miss every shot
                    >he turns around
                    >kills me in one shot
                    >exit cs:go

                    10/10
                """.trimIndent(),
            ),
            Review(
                author = User(
                    avatar = R.drawable.avatar_auguste,
                    name = "Auguste Conte",
                ),
                date = "February 14, 2019",
                message = """
                    The time I spent playing this game could've been spent...
                    ...studying
                    ...applying for jobs
                    ...making friends irl
                    ...getting a gf
                    ...spending time with my family
                    ...working out
                    ...becoming a better man in general

                    From the time I spent in this game, I got...
                    ...an extremely racist and homophobic vocabulary
                    ...free Russian lessons
                    ...anger management issues
                    ...borderline autistic tendencies
                    ...sleep deprivation

                    10/10 would never uninstall this game and correct my life
                """.trimIndent(),
            ),
        ),
    )
}
