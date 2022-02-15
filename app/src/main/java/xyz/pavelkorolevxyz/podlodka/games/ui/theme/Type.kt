package xyz.pavelkorolevxyz.podlodka.games.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import xyz.pavelkorolevxyz.podlodka.games.R

val skModernistFontFamily = FontFamily(
    Font(R.font.sk_modernist_regular),
    Font(R.font.sk_modernist_bold, weight = FontWeight.Bold),
)

val montserratFontFamily = FontFamily(
    Font(R.font.montserrat_medium),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = montserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 19.sp,
        color = LinkWater70,
    ),
)
