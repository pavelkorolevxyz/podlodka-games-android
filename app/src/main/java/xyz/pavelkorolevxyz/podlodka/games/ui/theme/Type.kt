package xyz.pavelkorolevxyz.podlodka.games.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
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
    titleLarge = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.6.sp,
        color = LinkWater,
    ),
    labelMedium = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = Abbey,
    ),
    labelSmall = TextStyle(
        fontFamily = montserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 19.sp,
        color = LinkWater70,
    ),
    bodyMedium = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp,
        lineHeight = 19.sp,
        color = LinkWater70,
    ),
    bodyLarge = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Color.White,
    ),
    headlineLarge = TextStyle(
        fontFamily = skModernistFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        color = Color.White,
    ),
)
